.class public final Ll/᩷۬᩷;
.super Ljava/lang/Object;
.source "86KD"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩷:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Ll/᩷۬᩷;->ۙ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 70
    iput p1, p0, Ll/᩷۬᩷;->᩷:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 96
    iput-object p1, p0, Ll/᩷۬᩷;->ۙ:Ljava/lang/String;

    const/4 p1, 0x1

    .line 98
    iput p1, p0, Ll/᩷۬᩷;->᩷:I

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 5

    .line 169
    iget v0, p0, Ll/᩷۬᩷;->᩷:I

    if-nez v0, :cond_0

    .line 146
    iget-object v0, p0, Ll/᩷۬᩷;->ۙ:Ljava/lang/String;

    return-object v0

    .line 170
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Wrong data accessor type detected. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "String"

    if-eqz v0, :cond_2

    const/4 v4, 0x1

    if-eq v0, v4, :cond_1

    const-string v0, "Unknown"

    goto :goto_0

    :cond_1
    const-string v0, "ArrayBuffer"

    goto :goto_0

    :cond_2
    move-object v0, v3

    :goto_0
    const-string v4, " expected, but got "

    .line 0
    invoke-static {v2, v0, v4, v3}, Ll/ۨ᩹ۧ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 171
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ᩷()I
    .locals 1

    .line 107
    iget v0, p0, Ll/᩷۬᩷;->᩷:I

    return v0
.end method
