.class public final Ll/֨ۖۛ;
.super Ll/ۢۖۛ;
.source "P61M"


# instance fields
.field public ۙ:I

.field public ۤ:Z

.field public ᩷:Z

.field public final ᩸:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v0}, Ll/֨ۖۛ;-><init>(Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 70
    iput v0, p0, Ll/֨ۖۛ;->ۙ:I

    .line 79
    iput-object p1, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۢۖۛ;
    .locals 2

    .line 226
    iget-boolean v0, p0, Ll/֨ۖۛ;->᩷:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 227
    iput-boolean v0, p0, Ll/֨ۖۛ;->᩷:Z

    .line 228
    iget-object v0, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    return-object p0
.end method

.method public final ۙ()Ll/ۢۖۛ;
    .locals 2

    .line 155
    iget-object v0, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final ۙ(C)V
    .locals 1

    .line 145
    iget-object v0, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x4c

    .line 161
    iget-object v1, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    iget p1, p0, Ll/֨ۖۛ;->ۙ:I

    shl-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨ۖۛ;->ۙ:I

    return-void
.end method

.method public final ۚ()Ll/ۢۖۛ;
    .locals 2

    .line 226
    iget-boolean v0, p0, Ll/֨ۖۛ;->᩷:Z

    iget-object v1, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 227
    iput-boolean v0, p0, Ll/֨ۖۛ;->᩷:Z

    const/16 v0, 0x3e

    .line 228
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    :cond_0
    iget-boolean v0, p0, Ll/֨ۖۛ;->ۤ:Z

    if-nez v0, :cond_1

    const/16 v0, 0x28

    .line 131
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v0, 0x29

    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final ۤ()V
    .locals 3

    .line 237
    iget v0, p0, Ll/֨ۖۛ;->ۙ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    iget-object v2, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    if-ne v0, v1, :cond_0

    const/16 v0, 0x3e

    .line 238
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 240
    :cond_0
    iget v0, p0, Ll/֨ۖۛ;->ۙ:I

    ushr-int/2addr v0, v1

    iput v0, p0, Ll/֨ۖۛ;->ۙ:I

    const/16 v0, 0x3b

    .line 207
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۤ(Ljava/lang/String;)V
    .locals 3

    .line 237
    iget v0, p0, Ll/֨ۖۛ;->ۙ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    iget-object v2, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    if-ne v0, v1, :cond_0

    const/16 v0, 0x3e

    .line 238
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 240
    :cond_0
    iget v0, p0, Ll/֨ۖۛ;->ۙ:I

    ushr-int/2addr v0, v1

    iput v0, p0, Ll/֨ۖۛ;->ۙ:I

    const/16 v0, 0x2e

    .line 170
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    iget p1, p0, Ll/֨ۖۛ;->ۙ:I

    shl-int/2addr p1, v1

    iput p1, p0, Ll/֨ۖۛ;->ۙ:I

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 181
    iget v0, p0, Ll/֨ۖۛ;->ۙ:I

    and-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    if-nez v1, :cond_0

    or-int/lit8 v0, v0, 0x1

    .line 182
    iput v0, p0, Ll/֨ۖۛ;->ۙ:I

    const/16 v0, 0x3c

    .line 183
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v0, 0x2a

    .line 185
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۫()Ll/ۢۖۛ;
    .locals 2

    .line 226
    iget-boolean v0, p0, Ll/֨ۖۛ;->᩷:Z

    iget-object v1, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 227
    iput-boolean v0, p0, Ll/֨ۖۛ;->᩷:Z

    const/16 v0, 0x3e

    .line 228
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    :cond_0
    iget-boolean v0, p0, Ll/֨ۖۛ;->ۤ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 121
    iput-boolean v0, p0, Ll/֨ۖۛ;->ۤ:Z

    const/16 v0, 0x28

    .line 122
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    return-object p0
.end method

.method public final ܳ()Ll/ۢۖۛ;
    .locals 2

    .line 102
    iget-object v0, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final ᩴ()Ll/ۢۖۛ;
    .locals 0

    return-object p0
.end method

.method public final ᩷()Ll/ۢۖۛ;
    .locals 0

    return-object p0
.end method

.method public final ᩷(C)Ll/ۢۖۛ;
    .locals 3

    .line 193
    iget v0, p0, Ll/֨ۖۛ;->ۙ:I

    and-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    if-nez v1, :cond_0

    or-int/lit8 v0, v0, 0x1

    .line 194
    iput v0, p0, Ll/֨ۖۛ;->ۙ:I

    const/16 v0, 0x3c

    .line 195
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v0, 0x3d

    if-eq p1, v0, :cond_1

    .line 198
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 201
    :cond_1
    iget p1, p0, Ll/֨ۖۛ;->ۙ:I

    const/high16 v0, -0x80000000

    and-int/2addr p1, v0

    if-nez p1, :cond_2

    return-object p0

    :cond_2
    new-instance p1, Ll/֨ۖۛ;

    invoke-direct {p1, v2}, Ll/֨ۖۛ;-><init>(Ljava/lang/StringBuilder;)V

    return-object p1
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 2

    .line 88
    iget-boolean v0, p0, Ll/֨ۖۛ;->᩷:Z

    iget-object v1, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 89
    iput-boolean v0, p0, Ll/֨ۖۛ;->᩷:Z

    const/16 v0, 0x3c

    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3a

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ᩸()Ll/ۢۖۛ;
    .locals 2

    .line 139
    iget-object v0, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    const/16 v1, 0x5e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final ᩸(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x54

    .line 150
    iget-object v1, p0, Ll/֨ۖۛ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3b

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
