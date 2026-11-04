.class public final Ll/᩷ۜܳ;
.super Ljava/lang/Object;
.source "164Z"


# instance fields
.field public final ۙ:Ll/ۜ۠ܳ;

.field public ۤ:Z

.field public final ᩷:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll/ۜ۠ܳ;)V
    .locals 0

    .line 954
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 955
    iput-object p1, p0, Ll/᩷ۜܳ;->᩷:Landroid/view/View;

    .line 956
    iput-object p2, p0, Ll/᩷ۜܳ;->ۙ:Ll/ۜ۠ܳ;

    const/16 p2, 0x8

    .line 957
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 958
    new-instance p2, Ll/ۙۜܳ;

    invoke-direct {p2, p0}, Ll/ۙۜܳ;-><init>(Ll/᩷ۜܳ;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ۙ(Ll/᩷ۜܳ;)V
    .locals 2

    .line 979
    iget-boolean v0, p0, Ll/᩷ۜܳ;->ۤ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 982
    iput-boolean v0, p0, Ll/᩷ۜܳ;->ۤ:Z

    .line 983
    iget-object v0, p0, Ll/᩷ۜܳ;->᩷:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 984
    iget-object p0, p0, Ll/᩷ۜܳ;->ۙ:Ll/ۜ۠ܳ;

    invoke-virtual {p0}, Ll/ۜ۠ܳ;->run()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 979
    iget-boolean v0, p0, Ll/᩷ۜܳ;->ۤ:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 982
    :cond_0
    iput-boolean v1, p0, Ll/᩷ۜܳ;->ۤ:Z

    .line 983
    iget-object v0, p0, Ll/᩷ۜܳ;->᩷:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 984
    iget-object v0, p0, Ll/᩷ۜܳ;->ۙ:Ll/ۜ۠ܳ;

    invoke-virtual {v0}, Ll/ۜ۠ܳ;->run()V

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 965
    iget-boolean v0, p0, Ll/᩷ۜܳ;->ۤ:Z

    return v0
.end method
