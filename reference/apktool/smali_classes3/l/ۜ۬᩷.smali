.class public Ll/ۜ۬᩷;
.super Ljava/lang/Object;
.source "46YU"


# instance fields
.field public final ۙ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜ۬᩷;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ()I
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۜ۬᩷;->ۙ:Ljava/lang/Object;

    check-cast v0, Landroid/widget/AbsListView;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    return v0
.end method

.method public ۙ(I)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۜ۬᩷;->ۙ:Ljava/lang/Object;

    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setForceDark(I)V

    return-void
.end method

.method public ۤ()Landroid/widget/AbsListView;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۜ۬᩷;->ۙ:Ljava/lang/Object;

    check-cast v0, Landroid/widget/AbsListView;

    return-object v0
.end method

.method public ᩴ()V
    .locals 2

    .line 101
    iget-object v0, p0, Ll/ۜ۬᩷;->ۙ:Ljava/lang/Object;

    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setForceDarkBehavior(I)V

    return-void
.end method

.method public ᩷()I
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۜ۬᩷;->ۙ:Ljava/lang/Object;

    check-cast v0, Landroid/widget/AbsListView;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v0

    return v0
.end method

.method public ᩸()V
    .locals 2

    .line 115
    iget-object v0, p0, Ll/ۜ۬᩷;->ۙ:Ljava/lang/Object;

    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setAlgorithmicDarkeningAllowed(Z)V

    return-void
.end method
