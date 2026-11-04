.class public final Ll/ۛܽ᩺;
.super Ljava/lang/Object;
.source "49TC"

# interfaces
.implements Ll/۬֫᩷;
.implements Ll/ۧܽ᩺;


# direct methods
.method public static ۙ(Landroid/content/Context;Ljava/lang/String;)I
    .locals 5

    .line 142
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 143
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 97
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    goto :goto_0

    .line 101
    :cond_0
    invoke-static {p1}, Ll/ۖ᩶;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    goto :goto_3

    :cond_1
    if-nez v2, :cond_4

    .line 107
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 108
    array-length v4, v2

    if-gtz v4, :cond_2

    goto :goto_0

    .line 111
    :cond_2
    aget-object v2, v2, v0

    goto :goto_1

    :cond_3
    :goto_0
    return v3

    .line 114
    :cond_4
    :goto_1
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v3

    .line 115
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    if-ne v3, v1, :cond_5

    .line 50
    invoke-static {v4, v2}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 121
    invoke-static {p0, p1, v2, v1}, Ll/ۖ᩶;->ۙ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    goto :goto_2

    .line 123
    :cond_5
    invoke-static {p0, p1, v2}, Ll/ۖ᩶;->ۙ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    :goto_2
    if-nez p0, :cond_6

    :goto_3
    return v0

    :cond_6
    const/4 p0, -0x2

    return p0
.end method


# virtual methods
.method public ۙ(Ljava/lang/String;)Ll/᩻ܽ᩺;
    .locals 0

    .line 45
    sget-object p1, Ll/ۨܽ᩺;->ܰ:Ll/ۨܽ᩺;

    return-object p1
.end method
