.class public final Ll/ܽᩳۗ;
.super Ll/ܺ᩶ۗ;
.source "X6G9"


# static fields
.field public static final ܿ:Ll/ܽᩳۗ;


# instance fields
.field public final ܰ:[I

.field public final ᩶:Ll/ᩳۡۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 14
    new-instance v0, Ll/ܽᩳۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/ܽᩳۗ;-><init>(Ll/ᩳۡۗ;[I)V

    sput-object v0, Ll/ܽᩳۗ;->ܿ:Ll/ܽᩳۗ;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۡۗ;[I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/ܽᩳۗ;->᩶:Ll/ᩳۡۗ;

    .line 45
    iput-object p2, p0, Ll/ܽᩳۗ;->ܰ:[I

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;)Ll/ܽᩳۗ;
    .locals 1

    .line 32
    sget-object v0, Ll/ܽᩳۗ;->ܿ:Ll/ܽᩳۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    return-object v0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/ܽᩳۗ;
    .locals 5

    .line 18
    invoke-virtual {p0}, Ll/ۖۡۗ;->ᩴۙ()Ljava/util/List;

    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 20
    new-array v2, v1, [I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 22
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ֨ۗ;

    .line 23
    invoke-virtual {v4}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v4

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Ll/ܽᩳۗ;

    invoke-direct {v0, p1, v2}, Ll/ܽᩳۗ;-><init>(Ll/ᩳۡۗ;[I)V

    .line 26
    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    const-string p1, "Marked for inline"

    .line 27
    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 67
    invoke-virtual {p0}, Ll/ܽᩳۗ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "INLINE_NOT_NEEDED"

    return-object v0

    .line 70
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "INLINE: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܽᩳۗ;->᩶:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 12
    sget-object v0, Ll/ۧ۟ۗ;->۟:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()[I
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܽᩳۗ;->ܰ:[I

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ܽᩳۗ;->᩶:Ll/ᩳۡۗ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ll/ᩳۡۗ;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ܽᩳۗ;->᩶:Ll/ᩳۡۗ;

    return-object v0
.end method
