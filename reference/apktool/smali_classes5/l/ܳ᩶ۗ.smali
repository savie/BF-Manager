.class public final Ll/ܳ᩶ۗ;
.super Ll/ܺ᩶ۗ;
.source "855A"


# static fields
.field public static final ܿ:Ll/ܳ᩶ۗ;


# instance fields
.field public final ܰ:Ll/᩸᩶ۗ;

.field public final ᩶:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 11
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->ۤۙ:Ll/᩸᩶ۗ;

    const-string v2, "null"

    invoke-direct {v0, v1, v2}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    sput-object v0, Ll/ܳ᩶ۗ;->ܿ:Ll/ܳ᩶ۗ;

    return-void
.end method

.method public constructor <init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ܳ᩶ۗ;->ܰ:Ll/᩸᩶ۗ;

    .line 18
    iput-object p2, p0, Ll/ܳ᩶ۗ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 34
    const-class v2, Ll/ܳ᩶ۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 37
    :cond_1
    check-cast p1, Ll/ܳ᩶ۗ;

    .line 38
    iget-object v2, p0, Ll/ܳ᩶ۗ;->ܰ:Ll/᩸᩶ۗ;

    .line 22
    iget-object v3, p1, Ll/ܳ᩶ۗ;->ܰ:Ll/᩸᩶ۗ;

    if-ne v2, v3, :cond_2

    .line 38
    iget-object v2, p0, Ll/ܳ᩶ۗ;->᩶:Ljava/lang/Object;

    .line 26
    iget-object p1, p1, Ll/ܳ᩶ۗ;->᩶:Ljava/lang/Object;

    .line 38
    invoke-static {v2, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 48
    iget-object v2, p0, Ll/ܳ᩶ۗ;->ܰ:Ll/᩸᩶ۗ;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܳ᩶ۗ;->᩶:Ljava/lang/Object;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ܽۚۗ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 53
    sget-object v0, Ll/ᩴ᩶ۗ;->ۙ:[I

    iget-object v1, p0, Ll/ܳ᩶ۗ;->ܰ:Ll/᩸᩶ۗ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    iget-object v3, p0, Ll/ܳ᩶ۗ;->᩶:Ljava/lang/Object;

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "{"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 59
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{STRING: \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\"}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 57
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "null"

    return-object v0
.end method

.method public final ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 43
    sget-object v0, Ll/᩻᩶ۗ;->ᩴ:Ll/᩻᩶ۗ;

    return-object v0
.end method

.method public final ۙ()Ll/᩸᩶ۗ;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ܳ᩶ۗ;->ܰ:Ll/᩸᩶ۗ;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/Object;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ܳ᩶ۗ;->᩶:Ljava/lang/Object;

    return-object v0
.end method
