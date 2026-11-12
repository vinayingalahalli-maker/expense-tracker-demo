# ExpenseTrackerApiSdkService

A list of all methods in the `ExpenseTrackerApiSdkService` service. Click on the method name to view detailed information about that method.

| Methods                           | Description |
| :-------------------------------- | :---------- |
| [listCategories](#listcategories) |             |
| [createCategory](#createcategory) |             |
| [getCategory](#getcategory)       |             |
| [updateCategory](#updatecategory) |             |
| [listExpenses](#listexpenses)     |             |
| [createExpense](#createexpense)   |             |
| [getExpense](#getexpense)         |             |
| [updateExpense](#updateexpense)   |             |
| [deleteExpense](#deleteexpense)   |             |
| [listClaims](#listclaims)         |             |
| [createClaim](#createclaim)       |             |
| [getClaim](#getclaim)             |             |
| [submitClaim](#submitclaim)       |             |
| [approveClaim](#approveclaim)     |             |
| [rejectClaim](#rejectclaim)       |             |
| [reimburseClaim](#reimburseclaim) |             |

## listCategories

- HTTP Method: `GET`
- Endpoint: `/categories`

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.listCategories();

  console.log(data);
})();
```

## createCategory

- HTTP Method: `POST`
- Endpoint: `/categories`

**Parameters**

| Name | Type                                                        | Required | Description       |
| :--- | :---------------------------------------------------------- | :------- | :---------------- |
| body | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { CreateCategoryRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const createCategoryRequest: CreateCategoryRequest = {
    name: 'Travel',
    description: 'Flights, hotels, and ground transport',
    receiptThreshold: 50,
  };

  const data =
    await expenseTrackerApiSdk.expenseTrackerApiSdk.createCategory(createCategoryRequest);

  console.log(data);
})();
```

## getCategory

- HTTP Method: `GET`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.getCategory('{{category_id}}');

  console.log(data);
})();
```

## updateCategory

- HTTP Method: `PUT`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type                                                        | Required | Description       |
| :--- | :---------------------------------------------------------- | :------- | :---------------- |
| body | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | The request body. |
| id   | string                                                      | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { CreateCategoryRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const createCategoryRequest: CreateCategoryRequest = {
    name: 'Travel',
    description: 'Flights, hotels, and ground transport',
    receiptThreshold: 50,
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.updateCategory(
    '{{category_id}}',
    createCategoryRequest,
  );

  console.log(data);
})();
```

## listExpenses

- HTTP Method: `GET`
- Endpoint: `/expenses`

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.listExpenses();

  console.log(data);
})();
```

## createExpense

- HTTP Method: `POST`
- Endpoint: `/expenses`

**Parameters**

| Name | Type                                                      | Required | Description       |
| :--- | :-------------------------------------------------------- | :------- | :---------------- |
| body | [CreateExpenseRequest](../models/CreateExpenseRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { CreateExpenseRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const createExpenseRequest: CreateExpenseRequest = {
    categoryId: '{{category_id}}',
    amount: 42.5,
    currency: 'USD',
    date: '2026-11-10',
    description: 'Taxi to client site',
    receiptUrl: [],
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.createExpense(createExpenseRequest);

  console.log(data);
})();
```

## getExpense

- HTTP Method: `GET`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.getExpense('{{expense_id}}');

  console.log(data);
})();
```

## updateExpense

- HTTP Method: `PUT`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type                                                      | Required | Description       |
| :--- | :-------------------------------------------------------- | :------- | :---------------- |
| body | [UpdateExpenseRequest](../models/UpdateExpenseRequest.md) | ✅       | The request body. |
| id   | string                                                    | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk, UpdateExpenseRequest } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const updateExpenseRequest: UpdateExpenseRequest = {
    amount: 55,
    currency: 'USD',
    date: '2026-11-10',
    description: 'Taxi to client site (updated fare)',
    receiptUrl: 'https://receipts.example.com/r/abc123',
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.updateExpense(
    '{{expense_id}}',
    updateExpenseRequest,
  );

  console.log(data);
})();
```

## deleteExpense

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`string`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.deleteExpense('{{expense_id}}');

  console.log(data);
})();
```

## listClaims

- HTTP Method: `GET`
- Endpoint: `/claims`

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.listClaims();

  console.log(data);
})();
```

## createClaim

- HTTP Method: `POST`
- Endpoint: `/claims`

**Parameters**

| Name | Type                                                  | Required | Description       |
| :--- | :---------------------------------------------------- | :------- | :---------------- |
| body | [CreateClaimRequest](../models/CreateClaimRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { CreateClaimRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const createClaimRequest: CreateClaimRequest = {
    title: 'November Business Trip',
    expenseIds: ['{{expense_id}}'],
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.createClaim(createClaimRequest);

  console.log(data);
})();
```

## getClaim

- HTTP Method: `GET`
- Endpoint: `/claims/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.getClaim('{{claim_id}}');

  console.log(data);
})();
```

## submitClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/submit`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.submitClaim('{{claim_id}}');

  console.log(data);
})();
```

## approveClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/approve`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.approveClaim('{{claim_id}}');

  console.log(data);
})();
```

## rejectClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reject`

**Parameters**

| Name | Type                                                  | Required | Description       |
| :--- | :---------------------------------------------------- | :------- | :---------------- |
| body | [RejectClaimRequest](../models/RejectClaimRequest.md) | ✅       | The request body. |
| id   | string                                                | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk, RejectClaimRequest } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const rejectClaimRequest: RejectClaimRequest = {
    reason: 'Missing receipts for expenses above threshold',
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.rejectClaim(
    '{{claim_id}}',
    rejectClaimRequest,
  );

  console.log(data);
})();
```

## reimburseClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reimburse`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.reimburseClaim('{{claim_id}}');

  console.log(data);
})();
```
