.class public final synthetic Ll/ܶ᩻ܺ;
.super Ljava/lang/Object;
.source "PAIZ"

# interfaces
.implements Ll/ᩴ֨᩵;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶ᩻ܺ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/ܶ᩻ܺ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 41
    invoke-static {}, Ll/᩶᩷ۧ;->᩹()Ljava/lang/String;

    move-result-object v0

    const-string v1, "canary"

    const/4 v2, 0x0

    .line 1182
    invoke-static {v0, v1, v2}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "wxebc3fbb7741c16ce"

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-static {}, Ll/᩹᩻ܺ;->ۤ()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "wxe5512392c6d80259"

    .line 42
    :goto_0
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v1

    .line 43
    invoke-interface {v1, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
