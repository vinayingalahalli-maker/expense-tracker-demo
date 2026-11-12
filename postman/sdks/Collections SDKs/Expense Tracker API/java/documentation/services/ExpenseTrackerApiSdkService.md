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

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.listCategories();

    System.out.println(response);
  }
}

```

## createCategory

- HTTP Method: `POST`
- Endpoint: `/categories`

**Parameters**

| Name                  | Type                                                        | Required | Description  |
| :-------------------- | :---------------------------------------------------------- | :------- | :----------- |
| createCategoryRequest | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.CreateCategoryRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    CreateCategoryRequest createCategoryRequest = CreateCategoryRequest.builder()
      .name("Travel")
      .description("Flights, hotels, and ground transport")
      .receiptThreshold(50L)
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.createCategory(
      createCategoryRequest
    );

    System.out.println(response);
  }
}

```

## getCategory

- HTTP Method: `GET`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.getCategory("{{category_id}}");

    System.out.println(response);
  }
}

```

## updateCategory

- HTTP Method: `PUT`
- Endpoint: `/categories/{id}`

**Parameters**

| Name                  | Type                                                        | Required | Description  |
| :-------------------- | :---------------------------------------------------------- | :------- | :----------- |
| id                    | String                                                      | ✅       |              |
| createCategoryRequest | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.CreateCategoryRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    CreateCategoryRequest createCategoryRequest = CreateCategoryRequest.builder()
      .name("Travel")
      .description("Flights, hotels, and ground transport")
      .receiptThreshold(50L)
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.updateCategory(
      "{{category_id}}",
      createCategoryRequest
    );

    System.out.println(response);
  }
}

```

## listExpenses

- HTTP Method: `GET`
- Endpoint: `/expenses`

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.listExpenses();

    System.out.println(response);
  }
}

```

## createExpense

- HTTP Method: `POST`
- Endpoint: `/expenses`

**Parameters**

| Name                 | Type                                                      | Required | Description  |
| :------------------- | :-------------------------------------------------------- | :------- | :----------- |
| createExpenseRequest | [CreateExpenseRequest](../models/CreateExpenseRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.CreateExpenseRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    CreateExpenseRequest createExpenseRequest = CreateExpenseRequest.builder()
      .categoryId("{{category_id}}")
      .amount(42.5D)
      .currency("USD")
      .date("2026-11-10")
      .description("Taxi to client site")
      .receiptUrl(new Object())
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.createExpense(createExpenseRequest);

    System.out.println(response);
  }
}

```

## getExpense

- HTTP Method: `GET`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.getExpense("{{expense_id}}");

    System.out.println(response);
  }
}

```

## updateExpense

- HTTP Method: `PUT`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name                 | Type                                                      | Required | Description  |
| :------------------- | :-------------------------------------------------------- | :------- | :----------- |
| id                   | String                                                    | ✅       |              |
| updateExpenseRequest | [UpdateExpenseRequest](../models/UpdateExpenseRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.UpdateExpenseRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    UpdateExpenseRequest updateExpenseRequest = UpdateExpenseRequest.builder()
      .amount(55L)
      .currency("USD")
      .date("2026-11-10")
      .description("Taxi to client site (updated fare)")
      .receiptUrl("https://receipts.example.com/r/abc123")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.updateExpense(
      "{{expense_id}}",
      updateExpenseRequest
    );

    System.out.println(response);
  }
}

```

## deleteExpense

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`String`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    String response = expenseTrackerApiSdk.expenseTrackerApiSdk.deleteExpense("{{expense_id}}");

    System.out.println(response);
  }
}

```

## listClaims

- HTTP Method: `GET`
- Endpoint: `/claims`

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.listClaims();

    System.out.println(response);
  }
}

```

## createClaim

- HTTP Method: `POST`
- Endpoint: `/claims`

**Parameters**

| Name               | Type                                                  | Required | Description  |
| :----------------- | :---------------------------------------------------- | :------- | :----------- |
| createClaimRequest | [CreateClaimRequest](../models/CreateClaimRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.CreateClaimRequest;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    List<String> expenseIdsList = Arrays.asList("{{expense_id}}");

    CreateClaimRequest createClaimRequest = CreateClaimRequest.builder()
      .title("November Business Trip")
      .expenseIds(expenseIdsList)
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.createClaim(createClaimRequest);

    System.out.println(response);
  }
}

```

## getClaim

- HTTP Method: `GET`
- Endpoint: `/claims/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.getClaim("{{claim_id}}");

    System.out.println(response);
  }
}

```

## submitClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/submit`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.submitClaim("{{claim_id}}");

    System.out.println(response);
  }
}

```

## approveClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/approve`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.approveClaim("{{claim_id}}");

    System.out.println(response);
  }
}

```

## rejectClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reject`

**Parameters**

| Name               | Type                                                  | Required | Description  |
| :----------------- | :---------------------------------------------------- | :------- | :----------- |
| id                 | String                                                | ✅       |              |
| rejectClaimRequest | [RejectClaimRequest](../models/RejectClaimRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.RejectClaimRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    RejectClaimRequest rejectClaimRequest = RejectClaimRequest.builder()
      .reason("Missing receipts for expenses above threshold")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.rejectClaim(
      "{{claim_id}}",
      rejectClaimRequest
    );

    System.out.println(response);
  }
}

```

## reimburseClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reimburse`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.reimburseClaim("{{claim_id}}");

    System.out.println(response);
  }
}

```
