.class public final synthetic Ll/ۜۚ᩸;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/᩻ܶ᩵;
.implements Ll/۬᩺ۤ;


# direct methods
.method public static ۙ(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    sget v0, Ll/ۖ֫᩸;->۟᩷:I

    .line 1249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(II)I
    .locals 1

    const p1, -0xb8b8b9

    if-ne p2, p1, :cond_0

    .line 638
    sget p1, Ll/ۗۡ֫;->ۧ:I

    const v0, 0x3f59999a    # 0.85f

    invoke-static {p1, p2, v0}, Ll/ᩴᩳ;->ۙ(IIF)I

    move-result p1

    return p1

    :cond_0
    return p2
.end method
