from typing import Any, Optional, Union
from .utils.validator import Validator
from .utils.base_service import BaseService
from ..net.transport.serializer import Serializer
from ..net.sdk_config import SdkConfig
from ..net.environment.environment import Environment
from ..models.utils.cast_models import cast_models
from ..models import (
    CreateCategoryRequest,
    CreateClaimRequest,
    CreateExpenseRequest,
    RejectClaimRequest,
    UpdateExpenseRequest,
)


class ExpenseTrackerApiSdkService(BaseService):
    """
    Service class for ExpenseTrackerApiSdkService operations.
    Provides methods to interact with ExpenseTrackerApiSdkService-related API endpoints.
    Inherits common functionality from BaseService including authentication and request handling.
    """

    def __init__(self, *args, **kwargs):
        """Initialize the service and method-level configurations."""
        super().__init__(*args, **kwargs)
        self._list_categories_config: SdkConfig = {}
        self._create_category_config: SdkConfig = {}
        self._get_category_config: SdkConfig = {}
        self._update_category_config: SdkConfig = {}
        self._list_expenses_config: SdkConfig = {}
        self._create_expense_config: SdkConfig = {}
        self._get_expense_config: SdkConfig = {}
        self._update_expense_config: SdkConfig = {}
        self._delete_expense_config: SdkConfig = {}
        self._list_claims_config: SdkConfig = {}
        self._create_claim_config: SdkConfig = {}
        self._get_claim_config: SdkConfig = {}
        self._submit_claim_config: SdkConfig = {}
        self._approve_claim_config: SdkConfig = {}
        self._reject_claim_config: SdkConfig = {}
        self._reimburse_claim_config: SdkConfig = {}

    def set_list_categories_config(self, config: SdkConfig):
        """
        Sets method-level configuration for list_categories.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._list_categories_config = config
        return self

    def set_create_category_config(self, config: SdkConfig):
        """
        Sets method-level configuration for create_category.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._create_category_config = config
        return self

    def set_get_category_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_category.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_category_config = config
        return self

    def set_update_category_config(self, config: SdkConfig):
        """
        Sets method-level configuration for update_category.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._update_category_config = config
        return self

    def set_list_expenses_config(self, config: SdkConfig):
        """
        Sets method-level configuration for list_expenses.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._list_expenses_config = config
        return self

    def set_create_expense_config(self, config: SdkConfig):
        """
        Sets method-level configuration for create_expense.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._create_expense_config = config
        return self

    def set_get_expense_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_expense.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_expense_config = config
        return self

    def set_update_expense_config(self, config: SdkConfig):
        """
        Sets method-level configuration for update_expense.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._update_expense_config = config
        return self

    def set_delete_expense_config(self, config: SdkConfig):
        """
        Sets method-level configuration for delete_expense.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._delete_expense_config = config
        return self

    def set_list_claims_config(self, config: SdkConfig):
        """
        Sets method-level configuration for list_claims.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._list_claims_config = config
        return self

    def set_create_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for create_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._create_claim_config = config
        return self

    def set_get_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_claim_config = config
        return self

    def set_submit_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for submit_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._submit_claim_config = config
        return self

    def set_approve_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for approve_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._approve_claim_config = config
        return self

    def set_reject_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for reject_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._reject_claim_config = config
        return self

    def set_reimburse_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for reimburse_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._reimburse_claim_config = config
        return self

    @cast_models
    def list_categories(self, *, request_config: Optional[SdkConfig] = None) -> Any:
        """list_categories

        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        resolved_config = self._get_resolved_config(
            self._list_categories_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/categories",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("GET")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def create_category(
        self,
        request_body: CreateCategoryRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """create_category

        :param request_body: The request body.
        :type request_body: CreateCategoryRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(CreateCategoryRequest).is_nullable().validate(
            request_body, "request_body"
        )

        resolved_config = self._get_resolved_config(
            self._create_category_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/categories",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def get_category(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """get_category

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._get_category_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/categories/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("GET")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def update_category(
        self,
        request_body: CreateCategoryRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """update_category

        :param request_body: The request body.
        :type request_body: CreateCategoryRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(CreateCategoryRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._update_category_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/categories/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("PUT")
            .set_body(request_body)
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def list_expenses(self, *, request_config: Optional[SdkConfig] = None) -> Any:
        """list_expenses

        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        resolved_config = self._get_resolved_config(
            self._list_expenses_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/expenses",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("GET")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def create_expense(
        self,
        request_body: CreateExpenseRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """create_expense

        :param request_body: The request body.
        :type request_body: CreateExpenseRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(CreateExpenseRequest).is_nullable().validate(
            request_body, "request_body"
        )

        resolved_config = self._get_resolved_config(
            self._create_expense_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/expenses",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def get_expense(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """get_expense

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._get_expense_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/expenses/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("GET")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def update_expense(
        self,
        request_body: UpdateExpenseRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """update_expense

        :param request_body: The request body.
        :type request_body: UpdateExpenseRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(UpdateExpenseRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._update_expense_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/expenses/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("PUT")
            .set_body(request_body)
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def delete_expense(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> str:
        """delete_expense

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: str
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._delete_expense_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/expenses/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("DELETE")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def list_claims(self, *, request_config: Optional[SdkConfig] = None) -> Any:
        """list_claims

        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        resolved_config = self._get_resolved_config(
            self._list_claims_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/claims",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("GET")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def create_claim(
        self,
        request_body: CreateClaimRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """create_claim

        :param request_body: The request body.
        :type request_body: CreateClaimRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(CreateClaimRequest).is_nullable().validate(
            request_body, "request_body"
        )

        resolved_config = self._get_resolved_config(
            self._create_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/claims",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def get_claim(self, id_: str, *, request_config: Optional[SdkConfig] = None) -> Any:
        """get_claim

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._get_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/claims/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("GET")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def submit_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """submit_claim

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._submit_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/claims/{{id}}/submit",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def approve_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """approve_claim

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._approve_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/claims/{{id}}/approve",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def reject_claim(
        self,
        request_body: RejectClaimRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """reject_claim

        :param request_body: The request body.
        :type request_body: RejectClaimRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(RejectClaimRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._reject_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/claims/{{id}}/reject",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, status, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def reimburse_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """reimburse_claim

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._reimburse_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.DEFAULT.url}/claims/{{id}}/reimburse",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
        )

        response, status, _ = self.send_request(serialized_request)
        return response
