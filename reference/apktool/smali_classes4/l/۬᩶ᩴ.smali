.class public final synthetic Ll/۬᩶ᩴ;
.super Ljava/lang/Object;
.source "715Z"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩷:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(ILjava/io/Serializable;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۬᩶ᩴ;->ۙ:I

    iput-object p2, p0, Ll/۬᩶ᩴ;->᩷:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/۬᩶ᩴ;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/۬᩶ᩴ;->᩷:Ljava/io/Serializable;

    .line 9
    check-cast v0, [B

    .line 879
    new-instance v1, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/۬᩶ᩴ;->᩷:Ljava/io/Serializable;

    check-cast v0, Ll/᩸ܿᩴ;

    invoke-static {v0}, Ll/᩸ܿᩴ;->᩸(Ll/᩸ܿᩴ;)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
