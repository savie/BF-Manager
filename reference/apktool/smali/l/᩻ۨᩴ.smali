.class public final synthetic Ll/᩻ۨᩴ;
.super Ljava/lang/Object;
.source "X13G"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ۨᩴ;->ܰ:I

    iput-object p2, p0, Ll/᩻ۨᩴ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩻ۨᩴ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget v0, p0, Ll/᩻ۨᩴ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/᩻ۨᩴ;->ܿ:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/᩻ۨᩴ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 11
    check-cast v2, Ll/᩷ۨᩴ;

    .line 13
    check-cast v1, Ll/ۛ᩷۫;

    .line 15
    sget v0, Ll/᩸֫۫;->ܳ᩷:I

    .line 285
    invoke-virtual {v1}, Ll/ۛ᩷۫;->ܽ()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ll/᩷ۨᩴ;->ۙ(J)Z

    return-void

    .line 0
    :pswitch_0
    check-cast v2, Ll/ܰۖᩴ;

    check-cast v1, Ll/۬֨ᩴ;

    invoke-static {v2, v1}, Ll/ܰۖᩴ;->ۙ(Ll/ܰۖᩴ;Ll/۬֨ᩴ;)V

    return-void

    :pswitch_1
    check-cast v2, Ljava/io/InputStream;

    check-cast v1, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    sget-object v0, Ll/ܽۨᩴ;->ܰ:Ljava/lang/String;

    const-wide/16 v3, -0x1

    const/4 v0, 0x0

    .line 275
    :try_start_0
    invoke-static {v2, v1, v3, v4, v0}, Ll/᩶ۨᩴ;->ۙ(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/᩹ܿᩴ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 276
    :try_start_1
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 274
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    if-eqz v2, :cond_0

    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v1

    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_2
    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
