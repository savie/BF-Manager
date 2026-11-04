.class public final synthetic Ll/ܽ᩻ܺ;
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
    iput p1, p0, Ll/ܽ᩻ܺ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ܽ᩻ܺ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 36
    invoke-static {}, Ll/ۢۤ᩹;->᩸()V

    .line 37
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ۢۤ᩹;->᩷(Landroid/content/Context;)Ll/ۢۤ᩹;

    move-result-object v0

    return-object v0

    .line 71
    :pswitch_0
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "Mono.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_1
    invoke-static {}, Ll/᩹᩻ܺ;->᩷()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
