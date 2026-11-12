import { z } from 'zod';

/**
 * Zod schema for the UpdateExpenseRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const updateExpenseRequest = z.lazy(() => {
  return z.object({
    amount: z.number().optional().nullable(),
    currency: z.string().optional().nullable(),
    date: z.string().optional().nullable(),
    description: z.string().optional().nullable(),
    receiptUrl: z.string().optional().nullable(),
    additionalProperties: z.record(z.string(), z.unknown()).optional(),
  });
});

/**
 * @typedef {UpdateExpenseRequest} updateExpenseRequest
 * @property {number} amount
 * @property {string} currency
 * @property {string} date
 * @property {string} description
 * @property {string} receiptUrl
 */
export type UpdateExpenseRequest = z.infer<typeof updateExpenseRequest>;

/**
 * Zod schema for mapping API responses to the UpdateExpenseRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const updateExpenseRequestResponse = z.lazy(() => {
  return z
    .object({
      amount: z.number().optional().nullable(),
      currency: z.string().optional().nullable(),
      date: z.string().optional().nullable(),
      description: z.string().optional().nullable(),
      receipt_url: z.string().optional().nullable(),
    })
    .passthrough()
    .transform((data) => {
      const additionalProperties: { [key: string]: unknown } = {};
      const declaredKeys = new Set<string>([
        'amount',
        'currency',
        'date',
        'description',
        'receipt_url',
      ]);
      for (const key of globalThis.Object.keys(data)) {
        if (!declaredKeys.has(key)) {
          additionalProperties[key] = (data as { [key: string]: unknown })[key];
        }
      }
      return {
        amount: data['amount'],
        currency: data['currency'],
        date: data['date'],
        description: data['description'],
        receiptUrl: data['receipt_url'],
        additionalProperties,
      };
    });
});

/**
 * Zod schema for mapping the UpdateExpenseRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const updateExpenseRequestRequest = z.lazy(() => {
  return z
    .object({
      amount: z.number().optional().nullable(),
      currency: z.string().optional().nullable(),
      date: z.string().optional().nullable(),
      description: z.string().optional().nullable(),
      receiptUrl: z.string().optional().nullable(),
      additionalProperties: z.record(z.string(), z.unknown()).optional(),
    })
    .transform((data) => ({
      ...(data['additionalProperties'] ?? {}),
      amount: data['amount'],
      currency: data['currency'],
      date: data['date'],
      description: data['description'],
      receipt_url: data['receiptUrl'],
    }));
});
