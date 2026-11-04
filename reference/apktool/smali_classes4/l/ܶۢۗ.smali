.class public final enum Ll/ܶۢۗ;
.super Ljava/lang/Enum;
.source "SIU2"


# static fields
.field public static final enum ֡:Ll/ܶۢۗ;

.field public static final enum ֨:Ll/ܶۢۗ;

.field public static final enum ۟:Ll/ܶۢۗ;

.field public static final enum ۢ:Ll/ܶۢۗ;

.field public static final enum ܿ:Ll/ܶۢۗ;

.field public static final enum ᩳ:Ll/ܶۢۗ;

.field public static final synthetic ᩶:[Ll/ܶۢۗ;


# instance fields
.field public final ܰ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 6
    new-instance v0, Ll/ܶۢۗ;

    const/4 v1, 0x0

    const-string v2, "=="

    const-string v3, "EQ"

    invoke-direct {v0, v3, v1, v2}, Ll/ܶۢۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    .line 7
    new-instance v0, Ll/ܶۢۗ;

    const/4 v1, 0x1

    const-string v2, "!="

    const-string v3, "NE"

    invoke-direct {v0, v3, v1, v2}, Ll/ܶۢۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    .line 8
    new-instance v0, Ll/ܶۢۗ;

    const/4 v1, 0x2

    const-string v2, "<"

    const-string v3, "LT"

    invoke-direct {v0, v3, v1, v2}, Ll/ܶۢۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܶۢۗ;->ۢ:Ll/ܶۢۗ;

    .line 9
    new-instance v0, Ll/ܶۢۗ;

    const/4 v1, 0x3

    const-string v2, "<="

    const-string v3, "LE"

    invoke-direct {v0, v3, v1, v2}, Ll/ܶۢۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܶۢۗ;->ᩳ:Ll/ܶۢۗ;

    .line 10
    new-instance v0, Ll/ܶۢۗ;

    const/4 v1, 0x4

    const-string v2, ">"

    const-string v3, "GT"

    invoke-direct {v0, v3, v1, v2}, Ll/ܶۢۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܶۢۗ;->۟:Ll/ܶۢۗ;

    .line 11
    new-instance v0, Ll/ܶۢۗ;

    const/4 v1, 0x5

    const-string v2, ">="

    const-string v3, "GE"

    invoke-direct {v0, v3, v1, v2}, Ll/ܶۢۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܶۢۗ;->֡:Ll/ܶۢۗ;

    .line 5
    invoke-static {}, Ll/ܶۢۗ;->ᩴ()[Ll/ܶۢۗ;

    move-result-object v0

    sput-object v0, Ll/ܶۢۗ;->᩶:[Ll/ܶۢۗ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 16
    iput-object p3, p0, Ll/ܶۢۗ;->ܰ:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܶۢۗ;
    .locals 1

    .line 5
    const-class v0, Ll/ܶۢۗ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܶۢۗ;

    return-object p0
.end method

.method public static values()[Ll/ܶۢۗ;
    .locals 1

    .line 5
    sget-object v0, Ll/ܶۢۗ;->᩶:[Ll/ܶۢۗ;

    invoke-virtual {v0}, [Ll/ܶۢۗ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܶۢۗ;

    return-object v0
.end method

.method public static synthetic ᩴ()[Ll/ܶۢۗ;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ll/ܶۢۗ;

    .line 5
    sget-object v1, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶۢۗ;->ۢ:Ll/ܶۢۗ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶۢۗ;->ᩳ:Ll/ܶۢۗ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶۢۗ;->۟:Ll/ܶۢۗ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ܶۢۗ;->֡:Ll/ܶۢۗ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ۙ()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ܶۢۗ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public ᩸()Ll/ܶۢۗ;
    .locals 3

    .line 24
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 38
    sget-object v0, Ll/ܶۢۗ;->ۢ:Ll/ܶۢۗ;

    return-object v0

    .line 41
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown if operations type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 41
    throw v0

    .line 36
    :cond_1
    sget-object v0, Ll/ܶۢۗ;->ᩳ:Ll/ܶۢۗ;

    return-object v0

    .line 33
    :cond_2
    sget-object v0, Ll/ܶۢۗ;->۟:Ll/ܶۢۗ;

    return-object v0

    .line 31
    :cond_3
    sget-object v0, Ll/ܶۢۗ;->֡:Ll/ܶۢۗ;

    return-object v0

    .line 28
    :cond_4
    sget-object v0, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    return-object v0

    .line 26
    :cond_5
    sget-object v0, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    return-object v0
.end method
