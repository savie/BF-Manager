.class public final synthetic Ll/ܽۖۚ;
.super Ljava/lang/Object;
.source "K74T"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽۖۚ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 4

    .line 2
    iget v0, p0, Ll/ܽۖۚ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ᩴۗۨ;

    .line 10
    invoke-virtual {p1}, Ll/ᩴۗۨ;->᩷()J

    move-result-wide v0

    return-wide v0

    .line 14
    :pswitch_0
    check-cast p1, Ll/ܽ۠ۙ;

    .line 501
    iget-object p1, p1, Ll/ܽ۠ۙ;->ۤ:Ll/ܳ᩹ۙ;

    iget v0, p1, Ll/ܳ᩹ۙ;->֫ۙ:I

    .line 502
    iget p1, p1, Ll/ܳ᩹ۙ;->᩺:I

    if-lez v0, :cond_0

    if-lez p1, :cond_0

    int-to-long v0, v0

    int-to-long v2, p1

    mul-long v0, v0, v2

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    :goto_0
    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
