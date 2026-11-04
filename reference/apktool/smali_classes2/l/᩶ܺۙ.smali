.class public final Ll/᩶ܺۙ;
.super Ljava/lang/Object;
.source "V95G"

# interfaces
.implements Ll/ۧܺۙ;


# static fields
.field public static final ۙ:Ll/᩶ܺۙ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/᩶ܺۙ;

    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/᩶ܺۙ;->ۙ:Ll/᩶ܺۙ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;
    .locals 1

    .line 50
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Class;Ll/ۘܺۙ;)Ll/۫ܺۙ;
    .locals 0

    .line 148
    invoke-virtual {p0, p1}, Ll/᩶ܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۙ(Ll/۬֨᩵;Ll/ۘܺۙ;)Ll/۫ܺۙ;
    .locals 0

    .line 26
    invoke-static {p1}, Ll/ۙ֨ܺ;->ۙ(Ll/۬֨᩵;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ll/ۨۤۤ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1
.end method
