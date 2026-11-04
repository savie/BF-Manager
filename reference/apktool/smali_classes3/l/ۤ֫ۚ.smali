.class public final synthetic Ll/ۤ֫ۚ;
.super Ljava/lang/Object;
.source "X785"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۤ֫ۚ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 2
    iget v0, p0, Ll/ۤ֫ۚ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۖ֨;

    .line 9
    check-cast p2, Ll/ۖ֨;

    .line 575
    iget-object p1, p1, Ll/ۖ֨;->ۙ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, p2, Ll/ۖ֨;->ۙ:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۙ֫ۚ;

    check-cast p2, Ll/ۙ֫ۚ;

    .line 87
    iget p1, p1, Ll/ۙ֫ۚ;->ۚ:I

    iget p2, p2, Ll/ۙ֫ۚ;->ۚ:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
