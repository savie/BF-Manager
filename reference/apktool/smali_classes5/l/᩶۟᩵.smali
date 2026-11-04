.class public final Ll/᩶۟᩵;
.super Ll/֡۟᩵;


# direct methods
.method public static ۙ([Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 10265
    array-length v0, p0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 10268
    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "copyOf(...)"

    invoke-static {p0, v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v0, "asList(...)"

    .line 134
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 10267
    aget-object p0, p0, v0

    invoke-static {p0}, Ll/۟۟᩵;->ۙ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 10266
    :cond_1
    sget-object p0, Ll/᩷ᩳ᩵;->ܰ:Ll/᩷ᩳ᩵;

    return-object p0
.end method

.method public static ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    .line 0
    invoke-static {p3, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p4, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    sub-int/2addr p2, p1

    .line 933
    invoke-static {p3, p1, p4, p0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static ۙ(II[I[II)V
    .locals 1

    const-string v0, "<this>"

    .line 0
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p3, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    sub-int/2addr p4, p1

    .line 1005
    invoke-static {p2, p1, p3, p0, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static ۙ(II[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    const-string v0, "<this>"

    .line 0
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1484
    array-length v0, p2

    if-gt p1, v0, :cond_0

    .line 1485
    invoke-static {p2, p0, p1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "copyOfRange(...)"

    invoke-static {p0, p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 49
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, ") is greater than size ("

    const-string v1, ")."

    const-string v2, "toIndex ("

    .line 0
    invoke-static {v2, p1, p2, v1, v0}, Ll/֡᩷᩸;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 49
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ᩷(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 1

    and-int/lit8 p2, p2, 0x4

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/4 p0, 0x0

    .line 932
    :cond_0
    invoke-static {v0, p0, p1, p3, p4}, Ll/᩶۟᩵;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method
