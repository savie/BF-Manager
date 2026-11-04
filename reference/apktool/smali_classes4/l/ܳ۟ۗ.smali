.class public final Ll/ܳ۟ۗ;
.super Ljava/lang/Object;
.source "C6DO"


# static fields
.field public static final synthetic ۙ:I

.field public static final ᩷:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 19
    const-class v0, Ll/ܳ۟ۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ܳ۟ۗ;->᩷:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(JLl/֫֨ۗ;Ll/ۨۧ᩵;ZZ)Ljava/lang/String;
    .locals 3

    if-eqz p2, :cond_3

    .line 59
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩶()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    sget-object p4, Ll/ᩴ۟ۗ;->ۙ:[I

    invoke-virtual {p2}, Ll/֫֨ۗ;->ܶ()Ll/ۨ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p4, p4, v0

    const-wide/16 v0, 0x0

    packed-switch p4, :pswitch_data_0

    .line 103
    new-instance p0, Ll/۠ۧ᩵;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Unknown type in literalToString: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 103
    throw p0

    :pswitch_0
    cmp-long p3, p0, v0

    if-eqz p3, :cond_1

    const-string p3, "Wrong object literal: {} for type: {}"

    .line 97
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    sget-object p5, Ll/ܳ۟ۗ;->᩷:Ll/᩻ܽ᩺;

    invoke-interface {p5, p3, p4, p2}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, "null"

    return-object p0

    .line 92
    :pswitch_1
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    invoke-static {p0, p1}, Ll/ۨۧ᩵;->ۙ(D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_2
    long-to-int p1, p0

    .line 90
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ll/ۨۧ᩵;->ۙ(F)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 88
    :pswitch_3
    invoke-virtual {p3, p0, p1, p5}, Ll/ۨۧ᩵;->ۤ(JZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 86
    :pswitch_4
    invoke-virtual {p3, p0, p1, p5}, Ll/ۨۧ᩵;->᩷(JZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 84
    :pswitch_5
    invoke-virtual {p3, p0, p1, p5}, Ll/ۨۧ᩵;->᩸(JZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 82
    :pswitch_6
    invoke-virtual {p3, p0, p1, p5}, Ll/ۨۧ᩵;->ۙ(JZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_7
    long-to-int p1, p0

    int-to-char p0, p1

    .line 80
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p5, p0}, Ll/ۨۧ᩵;->ۙ(ZC)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_8
    cmp-long p2, p0, v0

    if-nez p2, :cond_2

    const-string p0, "false"

    return-object p0

    :cond_2
    const-string p0, "true"

    return-object p0

    .line 60
    :cond_3
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p3

    if-eqz p4, :cond_8

    .line 61
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    move-result-wide p4

    const-wide/16 v0, 0x64

    cmp-long v2, p4, v0

    if-lez v2, :cond_8

    const-string p4, "(0x"

    .line 0
    invoke-static {p3, p4}, Ll/ۗۚ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    .line 63
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_4

    .line 64
    sget-object p4, Ll/ۨ֨ۗ;->ۖ:Ll/ۨ֨ۗ;

    invoke-virtual {p2, p4}, Ll/֫֨ۗ;->᩷(Ll/ۨ֨ۗ;)Z

    move-result p4

    if-eqz p4, :cond_5

    :cond_4
    const-string p4, ", float:"

    .line 65
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    long-to-int p4, p0

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    :cond_5
    if-eqz p2, :cond_6

    .line 67
    sget-object p4, Ll/ۨ֨ۗ;->ۡ:Ll/ۨ֨ۗ;

    invoke-virtual {p2, p4}, Ll/֫֨ۗ;->᩷(Ll/ۨ֨ۗ;)Z

    move-result p2

    if-eqz p2, :cond_7

    :cond_6
    const-string p2, ", double:"

    .line 68
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    invoke-virtual {p3, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    :cond_7
    const/16 p0, 0x29

    .line 70
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    return-object p3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ۙ(Ll/֫֨ۗ;)Ljava/lang/String;
    .locals 3

    .line 25
    invoke-virtual {p0}, Ll/֫֨ۗ;->ܶ()Ll/ۨ֨ۗ;

    move-result-object v0

    .line 26
    sget-object v1, Ll/ۨ֨ۗ;->۬:Ll/ۨ֨ۗ;

    if-ne v0, v1, :cond_0

    .line 27
    invoke-virtual {p0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p0

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "L"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x3b

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 29
    :cond_0
    sget-object v1, Ll/ۨ֨ۗ;->۟:Ll/ۨ֨ۗ;

    if-ne v0, v1, :cond_1

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object p0

    invoke-static {p0}, Ll/ܳ۟ۗ;->ۙ(Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 32
    :cond_1
    invoke-virtual {v0}, Ll/ۨ֨ۗ;->ᩴ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩹֨ۗ;)Ljava/lang/String;
    .locals 5

    .line 109
    invoke-virtual {p0}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual {p0}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v1

    .line 114
    sget-object p0, Ll/ᩴ۟ۗ;->ۙ:[I

    invoke-virtual {v0}, Ll/֫֨ۗ;->ܶ()Ll/ۨ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget p0, p0, v3

    const-wide/16 v3, 0x0

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    cmp-long p0, v1, v3

    if-eqz p0, :cond_1

    const-string p0, "Wrong object literal: {} for type: {}"

    .line 134
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    sget-object v4, Ll/ܳ۟ۗ;->᩷:Ll/᩻ܽ᩺;

    invoke-interface {v4, p0, v3, v0}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, "null"

    return-object p0

    .line 129
    :pswitch_1
    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_2
    long-to-int p0, v1

    .line 127
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 124
    :pswitch_3
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_4
    long-to-int p0, v1

    int-to-char p0, p0

    .line 118
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_5
    cmp-long p0, v1, v3

    if-nez p0, :cond_2

    const-string p0, "false"

    return-object p0

    :cond_2
    const-string p0, "true"

    return-object p0

    :goto_0
    const/4 p0, 0x0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
