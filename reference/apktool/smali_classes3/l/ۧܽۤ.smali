.class public final Ll/ۧܽۤ;
.super Ljava/lang/Object;
.source "V4XG"


# direct methods
.method public static ۙ(Ljava/io/File;)Ll/۬ܺۤ;
    .locals 3

    .line 15
    new-instance v0, Ll/۬ܺۤ;

    .line 27
    new-instance v1, Ll/֫ܽۤ;

    const-string v2, "r"

    invoke-direct {v1, p0, v2}, Ll/֫ܽۤ;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 15
    invoke-direct {v0, v1}, Ll/۬ܺۤ;-><init>(Ll/ܳܽۤ;)V

    return-object v0
.end method

.method public static ۙ(Ll/ܳܽۤ;)Ll/۬ܺۤ;
    .locals 1

    .line 11
    new-instance v0, Ll/۬ܺۤ;

    invoke-direct {v0, p0}, Ll/۬ܺۤ;-><init>(Ll/ܳܽۤ;)V

    return-object v0
.end method

.method public static ۙ(Landroid/net/Uri;Ljava/lang/String;)Ll/ܳܽۤ;
    .locals 1

    .line 35
    new-instance v0, Ll/۫ܽۤ;

    invoke-direct {v0, p0, p1}, Ll/۫ܽۤ;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۙ(Ljava/io/File;Ljava/lang/String;)Ll/ܳܽۤ;
    .locals 1

    .line 27
    new-instance v0, Ll/֫ܽۤ;

    invoke-direct {v0, p0, p1}, Ll/֫ܽۤ;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method
