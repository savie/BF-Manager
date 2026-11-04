.class public final synthetic Ll/᩻ۢ᩹;
.super Ljava/lang/Object;
.source "2BVX"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۚۙܽ;
.implements Ll/᩻ܶ᩵;
.implements Ll/ۤ֨ܳ;
.implements Ll/᩸ۛܽ;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ۢ᩹;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;ZI)V
    .locals 0

    .line 0
    iput p3, p0, Ll/᩻ۢ᩹;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(IIII)I
    .locals 0

    mul-int p0, p0, p1

    sub-int/2addr p2, p0

    mul-int p2, p2, p3

    return p2
.end method

.method public static ۙ(IILjava/lang/String;)I
    .locals 0

    .line 0
    invoke-static {p2}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, p0

    mul-int p2, p2, p1

    return p2
.end method

.method public static ۙ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Lorg/bouncycastle/asn1/ASN1Sequence;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ܺۢ᩹;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 1

    .line 76
    instance-of v0, p1, Ll/ܺۢ᩹;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܺۢ᩹;

    invoke-interface {p0, p1}, Ll/ܺۢ᩹;->ۤ(Ll/ܺۢ᩹;)Ll/ۧۢ᩹;

    move-result-object p0

    return-object p0

    .line 77
    :cond_0
    invoke-static {p0, p1}, Ll/ۖ۫ۗ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 88
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 2
    iget v0, p0, Ll/᩻ۢ᩹;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ljava/lang/Long;

    .line 911
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    sget-object p1, Ll/ᩴۢ᩸;->ܿ:Ll/ᩴۢ᩸;

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast p1, Ll/ܺۗۙ;

    .line 95
    iget p1, p1, Ll/ܺۗۙ;->ᩴ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 912
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x2

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    sget-object p1, Ll/ᩴۢ᩸;->֡:Ll/ᩴۢ᩸;

    goto :goto_0

    .line 913
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x3

    cmp-long p1, v0, v2

    if-nez p1, :cond_2

    sget-object p1, Ll/ᩴۢ᩸;->᩶:Ll/ᩴۢ᩸;

    goto :goto_0

    :cond_2
    sget-object p1, Ll/ᩴۢ᩸;->۟:Ll/ᩴۢ᩸;

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public construct()Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance v0, Ll/ܽ֫ۗ;

    invoke-direct {v0}, Ll/ܽ֫ۗ;-><init>()V

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/᩻ۢ᩹;->ܰ:I

    .line 4
    check-cast p1, Ll/ᩴᩳۙ;

    packed-switch v0, :pswitch_data_0

    .line 530
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 590
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
