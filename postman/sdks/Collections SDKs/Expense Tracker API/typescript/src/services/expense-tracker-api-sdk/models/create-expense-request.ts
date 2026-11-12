import { z } from 'zod';

/**
 * Zod schema for the CreateExpenseRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const createExpenseRequest = z.lazy(() => {
  return z.object({
    categoryId: z.string().optional().nullable(),
    amount: z.number().optional().nullable(),
    currency: z.string().optional().nullable(),
    date: z.string().optional().nullable(),
    description: z.string().optional().nullable(),
    receiptUrl: z.any().optional().nullable(),
    additionalProperties: z.record(z.string(), z.unknown()).optional(),
  });
});

/**
 * @typedef {CreateExpenseRequest} createExpenseRequest
 * @property {string} categoryId
 * @property {number} amount
 * @property {string} currency
 * @property {string} date
 * @property {string} description
 * @property {any} receiptUrl
 */
export type CreateExpenseRequest = z.infer<typeof createExpenseRequest>;

/**
 * Zod schema for mapping API responses to the CreateExpenseRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const createExpenseRequestResponse = z.lazy(() => {
  return z
    .object({
      category_id: z.string().optional().nullable(),
      amount: z.number().optional().nullable(),
      currency: z.string().optional().nullable(),
      date: z.string().optional().nullable(),
      description: z.string().optional().nullable(),
      receipt_url: z.any().optional().nullable(),
    })
    .passthrough()
    .transform((data) => {
      const additionalProperties: { [key: string]: unknown } = {};
      const declaredKeys = new Set<string>([
        'category_id',
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
        categoryId: data['category_id'],
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
 * Zod schema for mapping the CreateExpenseRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const createExpenseRequestRequest = z.lazy(() => {
  return z
    .object({
      categoryId: z.string().optional().nullable(),
      amount: z.number().optional().nullable(),
      currency: z.string().optional().nullable(),
      date: z.string().optional().nullable(),
      description: z.string().optional().nullable(),
      receiptUrl: z.any().optional().nullable(),
      additionalProperties: z.record(z.string(), z.unknown()).optional(),
    })
    .transform((data) => ({
      ...(data['additionalProperties'] ?? {}),
      category_id: data['categoryId'],
      amount: data['amount'],
      currency: data['currency'],
      date: data['date'],
      description: data['description'],
      receipt_url: data['receiptUrl'],
    }));
});
