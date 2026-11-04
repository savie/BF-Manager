.class public final enum Ll/۫֨ۗ;
.super Ljava/lang/Enum;
.source "J6GG"


# static fields
.field public static final enum ֡:Ll/۫֨ۗ;

.field public static final enum ۟:Ll/۫֨ۗ;

.field public static final synthetic ܿ:[Ll/۫֨ۗ;

.field public static final enum ᩳ:Ll/۫֨ۗ;


# instance fields
.field public final ܰ:I

.field public final ᩶:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 314
    new-instance v0, Ll/۫֨ۗ;

    const-string v1, "? extends "

    const-string v2, "EXTENDS"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4, v1}, Ll/۫֨ۗ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Ll/۫֨ۗ;->֡:Ll/۫֨ۗ;

    .line 315
    new-instance v0, Ll/۫֨ۗ;

    const-string v1, "UNBOUND"

    const-string v2, "?"

    invoke-direct {v0, v1, v4, v3, v2}, Ll/۫֨ۗ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Ll/۫֨ۗ;->ᩳ:Ll/۫֨ۗ;

    .line 316
    new-instance v0, Ll/۫֨ۗ;

    const/4 v1, -0x1

    const-string v2, "? super "

    const-string v3, "SUPER"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Ll/۫֨ۗ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Ll/۫֨ۗ;->۟:Ll/۫֨ۗ;

    .line 313
    invoke-static {}, Ll/۫֨ۗ;->ᩴ()[Ll/۫֨ۗ;

    move-result-object v0

    sput-object v0, Ll/۫֨ۗ;->ܿ:[Ll/۫֨ۗ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 321
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 322
    iput p3, p0, Ll/۫֨ۗ;->ܰ:I

    .line 323
    iput-object p4, p0, Ll/۫֨ۗ;->᩶:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۫֨ۗ;
    .locals 1

    .line 313
    const-class v0, Ll/۫֨ۗ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۫֨ۗ;

    return-object p0
.end method

.method public static values()[Ll/۫֨ۗ;
    .locals 1

    .line 313
    sget-object v0, Ll/۫֨ۗ;->ܿ:[Ll/۫֨ۗ;

    invoke-virtual {v0}, [Ll/۫֨ۗ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۫֨ۗ;

    return-object v0
.end method

.method public static ۙ(I)Ll/۫֨ۗ;
    .locals 1

    if-nez p0, :cond_0

    .line 335
    sget-object p0, Ll/۫֨ۗ;->ᩳ:Ll/۫֨ۗ;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    sget-object p0, Ll/۫֨ۗ;->֡:Ll/۫֨ۗ;

    return-object p0

    :cond_1
    sget-object p0, Ll/۫֨ۗ;->۟:Ll/۫֨ۗ;

    return-object p0
.end method

.method public static synthetic ᩴ()[Ll/۫֨ۗ;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/۫֨ۗ;

    .line 313
    sget-object v1, Ll/۫֨ۗ;->֡:Ll/۫֨ۗ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/۫֨ۗ;->ᩳ:Ll/۫֨ۗ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/۫֨ۗ;->۟:Ll/۫֨ۗ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ۙ()I
    .locals 1

    .line 327
    iget v0, p0, Ll/۫֨ۗ;->ܰ:I

    return v0
.end method

.method public ᩸()Ljava/lang/String;
    .locals 1

    .line 331
    iget-object v0, p0, Ll/۫֨ۗ;->᩶:Ljava/lang/String;

    return-object v0
.end method
