.class public final synthetic Ll/ۡۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡۤۚ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۡۤۚ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    sget v0, Ll/ۛܳۚ;->ᩳ:I

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-static {}, Ll/ۛ᩸ۚ;->ᩴ()V

    return-void

    .line 316
    :goto_0
    :try_start_0
    invoke-static {}, Ll/۟۟ۧ;->ۙ()V
    :try_end_0
    .catch Ll/ᩳ۟ۧ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MT MCP radare2 prewarm failed"

    .line 318
    invoke-static {v1, v0}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
