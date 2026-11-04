.class public final Ll/ۧ᩻᩵;
.super Ljava/lang/Object;
.source "RITT"

# interfaces
.implements Ll/ۜ᩶ۗ;


# instance fields
.field public ֫:I

.field public ۙ:[I

.field public ۚ:J

.field public ۤ:Z

.field public ۧ:I

.field public ۫:I

.field public ܳ:Ll/۫ܺ᩵;

.field public ܶ:I

.field public ܺ:I

.field public final ܽ:Ll/ۨܺ᩵;

.field public ᩴ:I

.field public final ᩷:Ll/᩻ܺ᩵;

.field public final ᩸:Ll/ۨܺ᩵;

.field public ᩻:Ll/ۤܿۗ;


# direct methods
.method public constructor <init>(Ll/᩻ܺ᩵;Ll/ۨܺ᩵;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    new-array v0, v0, [I

    .line 29
    iput-object v0, p0, Ll/ۧ᩻᩵;->ۙ:[I

    .line 38
    iput-object p1, p0, Ll/ۧ᩻᩵;->᩷:Ll/᩻ܺ᩵;

    .line 39
    iput-object p2, p0, Ll/ۧ᩻᩵;->᩸:Ll/ۨܺ᩵;

    .line 40
    invoke-virtual {p2}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ᩻᩵;->ܽ:Ll/ۨܺ᩵;

    return-void
.end method


# virtual methods
.method public final getOffset()I
    .locals 1

    .line 52
    iget v0, p0, Ll/ۧ᩻᩵;->֫:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    iget v1, p0, Ll/ۧ᩻᩵;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "0x%04X"

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    .line 240
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۧ᩻᩵;->ۤ()Ll/ۙܿۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    iget-object v1, p0, Ll/ۧ᩻᩵;->ܳ:Ll/۫ܺ᩵;

    if-nez v1, :cond_0

    .line 242
    iget v1, p0, Ll/ۧ᩻᩵;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v4

    const-string v1, "(0x%04X)"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 86
    :cond_0
    iget v1, p0, Ll/ۧ᩻᩵;->ܺ:I

    .line 201
    iget-boolean v2, p0, Ll/ۧ᩻᩵;->ۤ:Z

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    .line 246
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    if-ge v4, v1, :cond_2

    if-eqz v4, :cond_1

    const-string v2, ", "

    .line 249
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v2, "r"

    .line 251
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۧ᩻᩵;->ۙ:[I

    aget v2, v2, v4

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 255
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۧ᩻᩵;->᩸:Ll/ۨܺ᩵;

    iget v1, p0, Ll/ۧ᩻᩵;->ᩴ:I

    invoke-virtual {v0, v1}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۗ()I
    .locals 1

    .line 177
    iget v0, p0, Ll/ۧ᩻᩵;->۫:I

    return v0
.end method

.method public final ۙ()I
    .locals 1

    .line 106
    iget v0, p0, Ll/ۧ᩻᩵;->ܶ:I

    return v0
.end method

.method public final ۙ(I)I
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۧ᩻᩵;->ۙ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۙ(J)V
    .locals 0

    .line 189
    iput-wide p1, p0, Ll/ۧ᩻᩵;->ۚ:J

    return-void
.end method

.method public final ۙ(Ll/ۤܿۗ;)V
    .locals 0

    .line 233
    iput-object p1, p0, Ll/ۧ᩻᩵;->᩻:Ll/ۤܿۗ;

    return-void
.end method

.method public final ۙ(Ll/۫ܺ᩵;)V
    .locals 0

    .line 217
    iput-object p1, p0, Ll/ۧ᩻᩵;->ܳ:Ll/۫ܺ᩵;

    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    .line 205
    iput-boolean p1, p0, Ll/ۧ᩻᩵;->ۤ:Z

    return-void
.end method

.method public final ۙ([I)V
    .locals 0

    .line 169
    iput-object p1, p0, Ll/ۧ᩻᩵;->ۙ:[I

    return-void
.end method

.method public final ۚ()Ll/ܺܺ᩵;
    .locals 3

    .line 131
    iget v0, p0, Ll/ۧ᩻᩵;->ᩴ:I

    .line 182
    new-instance v1, Ll/ܺܺ᩵;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ܺܺ᩵;-><init>(Ll/ۛܺ᩵;)V

    .line 183
    iget-object v2, p0, Ll/ۧ᩻᩵;->᩸:Ll/ۨܺ᩵;

    invoke-virtual {v2, v1, v0}, Ll/ۨܺ᩵;->ۙ(Ll/ܺܺ᩵;I)I

    move-result v0

    .line 184
    invoke-virtual {v2, v0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܺܺ᩵;->᩷(Ljava/lang/String;)V

    return-object v1
.end method

.method public final ۚ(I)V
    .locals 0

    .line 193
    iput p1, p0, Ll/ۧ᩻᩵;->ܶ:I

    return-void
.end method

.method public final ۤ()Ll/ۙܿۗ;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۧ᩻᩵;->ܳ:Ll/۫ܺ᩵;

    if-nez v0, :cond_0

    .line 64
    sget-object v0, Ll/ۙܿۗ;->ۙᩴ:Ll/ۙܿۗ;

    return-object v0

    .line 66
    :cond_0
    invoke-virtual {v0}, Ll/۫ܺ᩵;->ۙ()Ll/ۙܿۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ(I)V
    .locals 0

    .line 197
    iput p1, p0, Ll/ۧ᩻᩵;->ᩴ:I

    return-void
.end method

.method public final ۧ()Ll/֡᩶ۗ;
    .locals 3

    .line 141
    iget v0, p0, Ll/ۧ᩻᩵;->ᩴ:I

    iget-object v1, p0, Ll/ۧ᩻᩵;->ܽ:Ll/ۨܺ᩵;

    iget-object v2, p0, Ll/ۧ᩻᩵;->᩸:Ll/ۨܺ᩵;

    invoke-virtual {v2, v0, v1}, Ll/ۨܺ᩵;->ۙ(ILl/ۨܺ᩵;)Ll/֡᩶ۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ۨ()Z
    .locals 1

    .line 201
    iget-boolean v0, p0, Ll/ۧ᩻᩵;->ۤ:Z

    return v0
.end method

.method public final ۫()Ll/᩵ܺ᩵;
    .locals 3

    .line 136
    iget v0, p0, Ll/ۧ᩻᩵;->ᩴ:I

    .line 200
    new-instance v1, Ll/᩵ܺ᩵;

    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 201
    iget-object v2, p0, Ll/ۧ᩻᩵;->᩸:Ll/ۨܺ᩵;

    invoke-virtual {v2, v0, v1}, Ll/ۨܺ᩵;->ۙ(ILl/᩵ܺ᩵;)V

    return-object v1
.end method

.method public final ۫(I)V
    .locals 0

    .line 173
    iput p1, p0, Ll/ۧ᩻᩵;->ܺ:I

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 126
    iget-object v0, p0, Ll/ۧ᩻᩵;->᩸:Ll/ۨܺ᩵;

    iget v1, p0, Ll/ۧ᩻᩵;->ᩴ:I

    invoke-virtual {v0, v1}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ(I)V
    .locals 0

    .line 229
    iput p1, p0, Ll/ۧ᩻᩵;->ۧ:I

    return-void
.end method

.method public final ܶ()I
    .locals 1

    .line 86
    iget v0, p0, Ll/ۧ᩻᩵;->ܺ:I

    return v0
.end method

.method public final ܺ()Ll/۬᩶ۗ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۧ᩻᩵;->ܳ:Ll/۫ܺ᩵;

    invoke-virtual {v0}, Ll/۫ܺ᩵;->ۤ()Ll/۬᩶ۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۧ᩻᩵;->ܳ:Ll/۫ܺ᩵;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۧ᩻᩵;->ۤ:Z

    if-nez v0, :cond_0

    .line 46
    invoke-static {p0}, Ll/᩻ܺ᩵;->ۙ(Ll/ۧ᩻᩵;)V

    :cond_0
    return-void
.end method

.method public final ᩴ()J
    .locals 2

    .line 101
    iget-wide v0, p0, Ll/ۧ᩻᩵;->ۚ:J

    return-wide v0
.end method

.method public final ᩴ(I)V
    .locals 0

    .line 209
    iput p1, p0, Ll/ۧ᩻᩵;->֫:I

    return-void
.end method

.method public final ᩵()I
    .locals 1

    .line 225
    iget v0, p0, Ll/ۧ᩻᩵;->ۧ:I

    return v0
.end method

.method public final ᩷(I)Ll/ۗܺ᩵;
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ۧ᩻᩵;->᩸:Ll/ۨܺ᩵;

    invoke-virtual {v0, p1}, Ll/ۨܺ᩵;->ᩴ(I)Ll/ۗܺ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷()[I
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ۧ᩻᩵;->ۙ:[I

    return-object v0
.end method

.method public final ᩸()Ll/᩻ܺ᩵;
    .locals 1

    .line 221
    iget-object v0, p0, Ll/ۧ᩻᩵;->᩷:Ll/᩻ܺ᩵;

    return-object v0
.end method

.method public final ᩸(I)V
    .locals 0

    .line 181
    iput p1, p0, Ll/ۧ᩻᩵;->۫:I

    return-void
.end method

.method public final ᩹()Ll/۫ܺ᩵;
    .locals 1

    .line 213
    iget-object v0, p0, Ll/ۧ᩻᩵;->ܳ:Ll/۫ܺ᩵;

    return-object v0
.end method

.method public final ᩻()Ll/ۤܿۗ;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۧ᩻᩵;->᩻:Ll/ۤܿۗ;

    return-object v0
.end method
