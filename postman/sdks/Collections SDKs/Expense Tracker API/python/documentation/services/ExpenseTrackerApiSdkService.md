# ExpenseTrackerApiSdkService

A list of all methods in the `ExpenseTrackerApiSdkService` service. Click on the method name to view detailed information about that method.

| Methods                             | Description |
| :---------------------------------- | :---------- |
| [list_categories](#list_categories) |             |
| [create_category](#create_category) |             |
| [get_category](#get_category)       |             |
| [update_category](#update_category) |             |
| [list_expenses](#list_expenses)     |             |
| [create_expense](#create_expense)   |             |
| [get_expense](#get_expense)         |             |
| [update_expense](#update_expense)   |             |
| [delete_expense](#delete_expense)   |             |
| [list_claims](#list_claims)         |             |
| [create_claim](#create_claim)       |             |
| [get_claim](#get_claim)             |             |
| [submit_claim](#submit_claim)       |             |
| [approve_claim](#approve_claim)     |             |
| [reject_claim](#reject_claim)       |             |
| [reimburse_claim](#reimburse_claim) |             |

## list_categories

- HTTP Method: `GET`
- Endpoint: `/categories`

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.list_categories()

print(result)
```

## create_category

- HTTP Method: `POST`
- Endpoint: `/categories`

**Parameters**

| Name         | Type                                                        | Required | Description       |
| :----------- | :---------------------------------------------------------- | :------- | :---------------- |
| request_body | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import CreateCategoryRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = CreateCategoryRequest(
    name="Travel",
    description="Flights, hotels, and ground transport",
    receipt_threshold=50
)

result = sdk.expense_tracker_api_sdk.create_category(request_body=request_body)

print(result)
```

## get_category

- HTTP Method: `GET`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.get_category(id_="{{category_id}}")

print(result)
```

## update_category

- HTTP Method: `PUT`
- Endpoint: `/categories/{id}`

**Parameters**

| Name         | Type                                                        | Required | Description       |
| :----------- | :---------------------------------------------------------- | :------- | :---------------- |
| request_body | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | The request body. |
| id\_         | str                                                         | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import CreateCategoryRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = CreateCategoryRequest(
    name="Travel",
    description="Flights, hotels, and ground transport",
    receipt_threshold=50
)

result = sdk.expense_tracker_api_sdk.update_category(
    request_body=request_body,
    id_="{{category_id}}"
)

print(result)
```

## list_expenses

- HTTP Method: `GET`
- Endpoint: `/expenses`

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.list_expenses()

print(result)
```

## create_expense

- HTTP Method: `POST`
- Endpoint: `/expenses`

**Parameters**

| Name         | Type                                                      | Required | Description       |
| :----------- | :-------------------------------------------------------- | :------- | :---------------- |
| request_body | [CreateExpenseRequest](../models/CreateExpenseRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import CreateExpenseRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = CreateExpenseRequest(
    category_id="{{category_id}}",
    amount=42.5,
    currency="USD",
    date_="2026-11-10",
    description="Taxi to client site",
    receipt_url=""
)

result = sdk.expense_tracker_api_sdk.create_expense(request_body=request_body)

print(result)
```

## get_expense

- HTTP Method: `GET`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.get_expense(id_="{{expense_id}}")

print(result)
```

## update_expense

- HTTP Method: `PUT`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name         | Type                                                      | Required | Description       |
| :----------- | :-------------------------------------------------------- | :------- | :---------------- |
| request_body | [UpdateExpenseRequest](../models/UpdateExpenseRequest.md) | ✅       | The request body. |
| id\_         | str                                                       | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import UpdateExpenseRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = UpdateExpenseRequest(
    amount=55,
    currency="USD",
    date_="2026-11-10",
    description="Taxi to client site (updated fare)",
    receipt_url="https://receipts.example.com/r/abc123"
)

result = sdk.expense_tracker_api_sdk.update_expense(
    request_body=request_body,
    id_="{{expense_id}}"
)

print(result)
```

## delete_expense

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`str`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.delete_expense(id_="{{expense_id}}")

with open("output-file.ext", "w") as f:
    f.write(result if isinstance(result, str) else result.decode(errors="replace") if isinstance(result, (bytes, bytearray)) else str(result))
```

## list_claims

- HTTP Method: `GET`
- Endpoint: `/claims`

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.list_claims()

print(result)
```

## create_claim

- HTTP Method: `POST`
- Endpoint: `/claims`

**Parameters**

| Name         | Type                                                  | Required | Description       |
| :----------- | :---------------------------------------------------- | :------- | :---------------- |
| request_body | [CreateClaimRequest](../models/CreateClaimRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import CreateClaimRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = CreateClaimRequest(
    title="November Business Trip",
    expense_ids=[
        "{{expense_id}}"
    ]
)

result = sdk.expense_tracker_api_sdk.create_claim(request_body=request_body)

print(result)
```

## get_claim

- HTTP Method: `GET`
- Endpoint: `/claims/{id}`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.get_claim(id_="{{claim_id}}")

print(result)
```

## submit_claim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/submit`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.submit_claim(id_="{{claim_id}}")

print(result)
```

## approve_claim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/approve`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.approve_claim(id_="{{claim_id}}")

print(result)
```

## reject_claim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reject`

**Parameters**

| Name         | Type                                                  | Required | Description       |
| :----------- | :---------------------------------------------------- | :------- | :---------------- |
| request_body | [RejectClaimRequest](../models/RejectClaimRequest.md) | ✅       | The request body. |
| id\_         | str                                                   | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import RejectClaimRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = RejectClaimRequest(
    reason="Missing receipts for expenses above threshold"
)

result = sdk.expense_tracker_api_sdk.reject_claim(
    request_body=request_body,
    id_="{{claim_id}}"
)

print(result)
```

## reimburse_claim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reimburse`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.reimburse_claim(id_="{{claim_id}}")

print(result)
```
