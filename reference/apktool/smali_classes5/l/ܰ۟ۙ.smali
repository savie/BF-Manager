.class public final synthetic Ll/ܰ۟ۙ;
.super Ljava/lang/Object;
.source "M8QF"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/᩸ۛܽ;


# direct methods
.method public static ۙ(IIII)I
    .locals 0

    or-int/2addr p0, p1

    or-int/2addr p0, p2

    or-int/lit16 p0, p0, 0x80

    or-int/2addr p0, p3

    return p0
.end method

.method public static ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1
    invoke-virtual {p0, p3, p4}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 2
    invoke-virtual {p0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(IZ)Z
    .locals 1

    and-int/lit8 p0, p0, 0x7

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public construct()Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ۤۗۙ;

    .line 1047
    new-instance v0, Ll/᩻֡ۙ;

    const-string v1, "Player release timed out."

    .line 76
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x3eb

    .line 1048
    invoke-static {v0, v1}, Ll/ܿ᩶ۙ;->ۙ(Ljava/lang/RuntimeException;I)Ll/ܿ᩶ۙ;

    move-result-object v0

    .line 1047
    invoke-interface {p1, v0}, Ll/ۤۗۙ;->ۙ(Ll/۠᩹ۙ;)V

    return-void
.end method
