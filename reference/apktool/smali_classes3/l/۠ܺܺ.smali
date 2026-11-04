.class public final synthetic Ll/۠ܺܺ;
.super Ljava/lang/Object;
.source "A5XF"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ܺܺ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    iget v0, p0, Ll/۠ܺܺ;->ܰ:I

    .line 4
    check-cast p1, Ll/۟ܺܺ;

    .line 6
    check-cast p2, Ll/۟ܺܺ;

    packed-switch v0, :pswitch_data_0

    .line 11
    sget v0, Ll/ۚ֨ۤ;->᩵ۙ:I

    .line 114
    invoke-virtual {p1}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v0

    invoke-virtual {p2}, Ll/۟ܺܺ;->getSize()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    goto :goto_0

    .line 880
    :pswitch_0
    invoke-virtual {p1}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v0

    invoke-virtual {p2}, Ll/۟ܺܺ;->getSize()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    :goto_0
    neg-int p1, p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
