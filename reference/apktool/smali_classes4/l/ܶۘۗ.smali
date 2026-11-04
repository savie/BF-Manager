.class public final enum Ll/ܶۘۗ;
.super Ljava/lang/Enum;
.source "X6IB"


# static fields
.field public static final enum ֡:Ll/ܶۘۗ;

.field public static final enum ۟:Ll/ܶۘۗ;

.field public static final synthetic ܰ:[Ll/ܶۘۗ;

.field public static final enum ܿ:Ll/ܶۘۗ;

.field public static final enum ᩶:Ll/ܶۘۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 7
    new-instance v0, Ll/ܶۘۗ;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܶۘۗ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܶۘۗ;->᩶:Ll/ܶۘۗ;

    .line 12
    new-instance v0, Ll/ܶۘۗ;

    const-string v1, "RESTRUCTURE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ܶۘۗ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܶۘۗ;->֡:Ll/ܶۘۗ;

    .line 17
    new-instance v0, Ll/ܶۘۗ;

    const-string v1, "SIMPLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ܶۘۗ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܶۘۗ;->۟:Ll/ܶۘۗ;

    .line 22
    new-instance v0, Ll/ܶۘۗ;

    const-string v1, "FALLBACK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/ܶۘۗ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܶۘۗ;->ܿ:Ll/ܶۘۗ;

    .line 3
    invoke-static {}, Ll/ܶۘۗ;->᩸()[Ll/ܶۘۗ;

    move-result-object v0

    sput-object v0, Ll/ܶۘۗ;->ܰ:[Ll/ܶۘۗ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܶۘۗ;
    .locals 1

    .line 3
    const-class v0, Ll/ܶۘۗ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܶۘۗ;

    return-object p0
.end method

.method public static values()[Ll/ܶۘۗ;
    .locals 1

    .line 3
    sget-object v0, Ll/ܶۘۗ;->ܰ:[Ll/ܶۘۗ;

    invoke-virtual {v0}, [Ll/ܶۘۗ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܶۘۗ;

    return-object v0
.end method

.method public static synthetic ᩸()[Ll/ܶۘۗ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ܶۘۗ;

    .line 3
    sget-object v1, Ll/ܶۘۗ;->᩶:Ll/ܶۘۗ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶۘۗ;->֡:Ll/ܶۘۗ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶۘۗ;->۟:Ll/ܶۘۗ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶۘۗ;->ܿ:Ll/ܶۘۗ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ۙ()Z
    .locals 3

    .line 25
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected decompilation mode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method
