from typing import Awaitable, Optional, Any, Union
from .utils.to_async import to_async
from ..expense_tracker_api_sdk import ExpenseTrackerApiSdkService
from ...net.sdk_config import SdkConfig
from ...models import (
    CreateCategoryRequest,
    CreateExpenseRequest,
    UpdateExpenseRequest,
    CreateClaimRequest,
    RejectClaimRequest,
)


class ExpenseTrackerApiSdkServiceAsync(ExpenseTrackerApiSdkService):
    """
    Async Wrapper for ExpenseTrackerApiSdkServiceAsync
    """

    def list_categories(
        self, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().list_categories)(request_config=request_config)

    def create_category(
        self,
        request_body: CreateCategoryRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().create_category)(
            request_body, request_config=request_config
        )

    def get_category(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().get_category)(id_, request_config=request_config)

    def update_category(
        self,
        request_body: CreateCategoryRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().update_category)(
            request_body, id_, request_config=request_config
        )

    def list_expenses(
        self, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().list_expenses)(request_config=request_config)

    def create_expense(
        self,
        request_body: CreateExpenseRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().create_expense)(
            request_body, request_config=request_config
        )

    def get_expense(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().get_expense)(id_, request_config=request_config)

    def update_expense(
        self,
        request_body: UpdateExpenseRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().update_expense)(
            request_body, id_, request_config=request_config
        )

    def delete_expense(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[str]:  # type: ignore[override]
        return to_async(super().delete_expense)(id_, request_config=request_config)

    def list_claims(
        self, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().list_claims)(request_config=request_config)

    def create_claim(
        self,
        request_body: CreateClaimRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().create_claim)(
            request_body, request_config=request_config
        )

    def get_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().get_claim)(id_, request_config=request_config)

    def submit_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().submit_claim)(id_, request_config=request_config)

    def approve_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().approve_claim)(id_, request_config=request_config)

    def reject_claim(
        self,
        request_body: RejectClaimRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().reject_claim)(
            request_body, id_, request_config=request_config
        )

    def reimburse_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:  # type: ignore[override]
        return to_async(super().reimburse_claim)(id_, request_config=request_config)
