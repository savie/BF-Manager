.class public final synthetic Ll/᩸ۖᩴ;
.super Ljava/lang/Object;
.source "964K"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:I

.field public final synthetic ۟:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩳ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/ۧۤ᩻;Landroid/content/Context;Landroid/content/Intent;ILl/᩷ۨᩴ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/᩸ۖᩴ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۖᩴ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩸ۖᩴ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩸ۖᩴ;->۟:Ljava/lang/Object;

    iput p4, p0, Ll/᩸ۖᩴ;->֡:I

    iput-object p5, p0, Ll/᩸ۖᩴ;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܰۖᩴ;Ll/۬֨ᩴ;ILjava/lang/String;Ll/۠ۨܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/᩸ۖᩴ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۖᩴ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩸ۖᩴ;->ܿ:Ljava/lang/Object;

    iput p3, p0, Ll/᩸ۖᩴ;->֡:I

    iput-object p4, p0, Ll/᩸ۖᩴ;->۟:Ljava/lang/Object;

    iput-object p5, p0, Ll/᩸ۖᩴ;->ᩳ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 2
    iget v0, p0, Ll/᩸ۖᩴ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/᩸ۖᩴ;->ᩳ:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/᩸ۖᩴ;->۟:Ljava/lang/Object;

    .line 8
    iget-object v3, p0, Ll/᩸ۖᩴ;->ܿ:Ljava/lang/Object;

    .line 10
    iget-object v4, p0, Ll/᩸ۖᩴ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 16
    move-object v6, v4

    check-cast v6, Ll/ۧۤ᩻;

    .line 18
    check-cast v3, Landroid/content/Context;

    .line 21
    move-object v10, v2

    check-cast v10, Landroid/content/Intent;

    .line 24
    move-object v9, v1

    check-cast v9, Ll/᩷ۨᩴ;

    .line 26
    sget v0, Ll/ۧۤ᩻;->ۧ᩷:I

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v4, Ll/ܰۖᩴ;

    check-cast v3, Ll/۬֨ᩴ;

    check-cast v2, Ljava/lang/String;

    check-cast v1, Ll/۠ۨܳ;

    iget v0, p0, Ll/᩸ۖᩴ;->֡:I

    invoke-static {v4, v3, v0, v2, v1}, Ll/ܰۖᩴ;->ۙ(Ll/ܰۖᩴ;Ll/۬֨ᩴ;ILjava/lang/String;Ll/۠ۨܳ;)V

    return-void

    .line 246
    :goto_0
    :try_start_0
    invoke-static {v3, v10}, Ll/᩹ۙ᩻;->ۙ(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v8, v0

    goto :goto_1

    :catch_0
    const/4 v0, 0x0

    const/4 v8, 0x0

    .line 254
    :goto_1
    new-instance v0, Ll/᩸ۤ᩻;

    iget v7, p0, Ll/᩸ۖᩴ;->֡:I

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Ll/᩸ۤ᩻;-><init>(Ll/ۧۤ᩻;IZLl/᩷ۨᩴ;Landroid/content/Intent;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
