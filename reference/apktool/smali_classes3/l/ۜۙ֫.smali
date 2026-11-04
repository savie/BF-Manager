.class public final synthetic Ll/ۜۙ֫;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ll/ۤ᩻ۙ;


# direct methods
.method public synthetic constructor <init>(ILl/ۤ᩻ۙ;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۜۙ֫;->ܰ:I

    iput-object p2, p0, Ll/ۜۙ֫;->᩶:Ll/ۤ᩻ۙ;

    iput-object p3, p0, Ll/ۜۙ֫;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/۫۬ܳ;Ll/۠ۖۧ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/ۜۙ֫;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۙ֫;->ܿ:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۜۙ֫;->᩶:Ll/ۤ᩻ۙ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/ۜۙ֫;->ܰ:I

    .line 4
    iget-object v0, p0, Ll/ۜۙ֫;->ܿ:Ljava/lang/Object;

    .line 6
    iget-object v1, p0, Ll/ۜۙ֫;->᩶:Ll/ۤ᩻ۙ;

    packed-switch p1, :pswitch_data_0

    .line 11
    check-cast v1, Ll/ܽ֡֫;

    .line 13
    check-cast v0, Ljava/lang/Throwable;

    .line 15
    sget p1, Ll/ܽ֡֫;->ۙ᩷:I

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    invoke-static {v0}, Ll/᩺ۢᩴ;->ۙ(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f12030d

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 323
    invoke-static {v1, p1, v0, v2, v2}, Ll/ۘܽ᩸;->ۙ(Ll/ܽ֡֫;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Ll/۫۬ܳ;

    check-cast v1, Ll/۠ۖۧ;

    invoke-static {v0, v1}, Ll/۫۬ܳ;->ۙ(Ll/۫۬ܳ;Ll/۠ۖۧ;)V

    return-void

    :pswitch_1
    check-cast v1, Ll/۠ۖۧ;

    check-cast v0, Ll/᩻֫ܺ;

    invoke-static {v1, v0}, Ll/ۗ᩷֫;->ۙ(Ll/۠ۖۧ;Ll/᩻֫ܺ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
