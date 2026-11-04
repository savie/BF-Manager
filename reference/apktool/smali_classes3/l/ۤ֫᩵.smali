.class public final Ll/ۤ֫᩵;
.super Ljava/lang/Object;
.source "R6C3"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(\\d+\\.\\d+\\.\\d+),\\s+(r\\d+)"

    .line 58
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void
.end method
