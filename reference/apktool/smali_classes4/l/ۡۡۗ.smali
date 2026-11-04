.class public final synthetic Ll/ۡۡۗ;
.super Ljava/lang/Object;
.source "J6B2"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡۡۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 2

    .line 2
    iget v0, p0, Ll/ۡۡۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۙۡ۫;

    .line 10
    invoke-virtual {p1}, Ll/ۙۡ۫;->getDataOffset()J

    move-result-wide v0

    return-wide v0

    .line 14
    :pswitch_0
    check-cast p1, Ll/᩷ۡۗ;

    .line 684
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
