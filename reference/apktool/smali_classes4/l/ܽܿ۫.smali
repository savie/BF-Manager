.class public final Ll/ܽܿ۫;
.super Ljava/io/BufferedOutputStream;
.source "AAGU"


# instance fields
.field public ܰ:Z

.field public final synthetic ᩶:Ll/᩵ܰܶ;


# direct methods
.method public constructor <init>(Ll/᩹ܿ۫;Ljava/io/OutputStream;Ll/᩵ܰܶ;)V
    .locals 0

    .line 362
    iput-object p3, p0, Ll/ܽܿ۫;->᩶:Ll/᩵ܰܶ;

    const p1, 0x8000

    invoke-direct {p0, p2, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 367
    iget-object v0, p0, Ll/ܽܿ۫;->᩶:Ll/᩵ܰܶ;

    iget-boolean v1, p0, Ll/ܽܿ۫;->ܰ:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 371
    :try_start_0
    invoke-super {p0}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 373
    sget v2, Ll/᩹ܿ۫;->ۖ:I

    .line 561
    invoke-static {v0}, Ll/ۢ᩶۫;->᩷(Ll/᩵ܰܶ;)V

    .line 374
    iput-boolean v1, p0, Ll/ܽܿ۫;->ܰ:Z

    return-void

    :catchall_0
    move-exception v2

    .line 373
    sget v3, Ll/᩹ܿ۫;->ۖ:I

    .line 561
    invoke-static {v0}, Ll/ۢ᩶۫;->᩷(Ll/᩵ܰܶ;)V

    .line 374
    iput-boolean v1, p0, Ll/ܽܿ۫;->ܰ:Z

    .line 375
    throw v2
.end method

.method public final finalize()V
    .locals 0

    .line 380
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 381
    invoke-virtual {p0}, Ll/ܽܿ۫;->close()V

    return-void
.end method
