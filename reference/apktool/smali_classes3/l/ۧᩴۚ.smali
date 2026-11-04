.class public abstract Ll/ۧᩴۚ;
.super Ljava/lang/Object;
.source "EIW0"


# static fields
.field public static volatile ۙ:Ll/ܳ᩷ۚ;


# direct methods
.method public static ۙ()Ll/ۧᩴۚ;
    .locals 2

    .line 20
    sget-object v0, Ll/ۧᩴۚ;->ۙ:Ll/ܳ᩷ۚ;

    const-string v1, "MCP host is not installed"

    invoke-static {v0, v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ۙ(Ll/ܳ᩷ۚ;)V
    .locals 0

    .line 15
    sput-object p0, Ll/ۧᩴۚ;->ۙ:Ll/ܳ᩷ۚ;

    return-void
.end method


# virtual methods
.method public abstract ۙ(Ljava/lang/String;)Ljava/lang/String;
.end method
