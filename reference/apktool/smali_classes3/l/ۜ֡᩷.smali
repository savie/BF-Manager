.class public final Ll/ۜ֡᩷;
.super Ljava/lang/Object;
.source "Y6A7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/᩻ᩳ᩷;


# direct methods
.method public constructor <init>(Ll/᩻ᩳ᩷;)V
    .locals 0

    .line 439
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ֡᩷;->ܰ:Ll/᩻ᩳ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 442
    iget-object v0, p0, Ll/ۜ֡᩷;->ܰ:Ll/᩻ᩳ᩷;

    iget-boolean v1, v0, Ll/᩻ᩳ᩷;->mFirstLayoutComplete:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 446
    :cond_0
    iget-boolean v1, v0, Ll/᩻ᩳ᩷;->mIsAttached:Z

    if-nez v1, :cond_1

    .line 447
    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->requestLayout()V

    return-void

    .line 451
    :cond_1
    iget-boolean v1, v0, Ll/᩻ᩳ᩷;->mLayoutSuppressed:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    .line 452
    iput-boolean v1, v0, Ll/᩻ᩳ᩷;->mLayoutWasDefered:Z

    return-void

    .line 455
    :cond_2
    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->consumePendingUpdateOperations()V

    :cond_3
    :goto_0
    return-void
.end method
