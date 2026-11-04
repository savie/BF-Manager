.class public final Ll/᩻֨᩸;
.super Ljava/lang/Object;
.source "P7QH"

# interfaces
.implements Lbin/mt/plugin/api/editor/TextEditor;


# instance fields
.field public ۙ:Ll/ᩳ۬᩸;

.field public final ۤ:Ll/᩺ۜ᩸;

.field public ᩴ:Z

.field public ᩷:Ll/ۢ᩶᩸;

.field public ᩸:Z


# direct methods
.method public constructor <init>(Ll/᩺ۜ᩸;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩻֨᩸;)Ll/᩺ۜ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    return-object p0
.end method

.method public static ۤ(Ll/᩻֨᩸;)V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object p0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {p0}, Ll/ۢ᩶᩸;->ۤ()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩻֨᩸;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩻֨᩸;->᩸:Z

    return p0
.end method


# virtual methods
.method public final deleteText(II)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v3, ""

    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 174
    invoke-virtual/range {v0 .. v5}, Ll/᩻֨᩸;->replaceText(IILjava/lang/CharSequence;II)V

    return-void
.end method

.method public final ensurePositionVisible(I)V
    .locals 1

    const/4 v0, 0x0

    .line 114
    invoke-virtual {p0, p1, v0}, Ll/᩻֨᩸;->ensurePositionVisible(IZ)V

    return-void
.end method

.method public final ensurePositionVisible(IZ)V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 120
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1, p2}, Ll/᩺ۜ᩸;->ۙ(IZ)Z

    return-void
.end method

.method public final ensurePositionVisibleInCenter(I)V
    .locals 1

    const/4 v0, 0x0

    .line 125
    invoke-virtual {p0, p1, v0}, Ll/᩻֨᩸;->ensurePositionVisibleInCenter(IZ)V

    return-void
.end method

.method public final ensurePositionVisibleInCenter(IZ)V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 131
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1, p2}, Ll/᩺ۜ᩸;->᩷(IZ)V

    return-void
.end method

.method public final ensureSelectionVisible()V
    .locals 1

    const/4 v0, 0x0

    .line 136
    invoke-virtual {p0, v0}, Ll/᩻֨᩸;->ensureSelectionVisible(Z)V

    return-void
.end method

.method public final ensureSelectionVisible(Z)V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 142
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->᩷(Z)V

    return-void
.end method

.method public final ensureSelectionVisibleInCenter()V
    .locals 1

    const/4 v0, 0x0

    .line 147
    invoke-virtual {p0, v0}, Ll/᩻֨᩸;->ensureSelectionVisibleInCenter(Z)V

    return-void
.end method

.method public final ensureSelectionVisibleInCenter(Z)V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 153
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۤ(Z)V

    return-void
.end method

.method public final finishLargeBatchEditingMode()V
    .locals 5

    .line 242
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    iget-boolean v1, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 246
    :try_start_0
    iput-boolean v1, p0, Ll/᩻֨᩸;->᩸:Z

    .line 247
    iget-object v1, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v1}, Ll/ۢ᩶᩸;->ۤ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    iput-boolean v3, p0, Ll/᩻֨᩸;->᩸:Z

    .line 250
    iput-object v2, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    .line 251
    iput-boolean v3, p0, Ll/᩻֨᩸;->ᩴ:Z

    .line 252
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    iget-object v3, p0, Ll/᩻֨᩸;->ۙ:Ll/ᩳ۬᩸;

    if-ne v1, v3, :cond_0

    .line 10117
    iget-boolean v1, v0, Ll/᩺ۜ᩸;->ۚ᩷:Z

    if-eqz v1, :cond_0

    .line 253
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۤۙ()V

    .line 255
    :cond_0
    iput-object v2, p0, Ll/᩻֨᩸;->ۙ:Ll/ᩳ۬᩸;

    return-void

    :catchall_0
    move-exception v1

    .line 249
    iput-boolean v3, p0, Ll/᩻֨᩸;->᩸:Z

    .line 250
    iput-object v2, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    .line 251
    iput-boolean v3, p0, Ll/᩻֨᩸;->ᩴ:Z

    .line 252
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v3

    iget-object v4, p0, Ll/᩻֨᩸;->ۙ:Ll/ᩳ۬᩸;

    if-ne v3, v4, :cond_1

    .line 10117
    iget-boolean v3, v0, Ll/᩺ۜ᩸;->ۚ᩷:Z

    if-eqz v3, :cond_1

    .line 253
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۤۙ()V

    .line 255
    :cond_1
    iput-object v2, p0, Ll/᩻֨᩸;->ۙ:Ll/ᩳ۬᩸;

    .line 256
    throw v1

    .line 243
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final getAnotherBracketPosition()I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 309
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v1

    .line 310
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 312
    iget-object v0, v0, Ll/᩺ۜ᩸;->۠:Ll/ܽ֨᩸;

    invoke-virtual {v0, v1}, Ll/ܽ֨᩸;->ۙ(I)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public final getBracketPositions()[I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 298
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v1

    .line 299
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 301
    iget-object v0, v0, Ll/᩺ۜ᩸;->۠:Ll/ܽ֨᩸;

    invoke-virtual {v0, v1}, Ll/ܽ֨᩸;->᩷(I)[I

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBufferedText()Lbin/mt/plugin/api/editor/BufferedText;
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 160
    :cond_0
    new-instance v0, Ll/ۧ֨᩸;

    invoke-direct {v0, p0}, Ll/ۧ֨᩸;-><init>(Ll/᩻֨᩸;)V

    return-object v0
.end method

.method public final getCurrentPageIndex()I
    .locals 1

    .line 271
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۙ()Ll/ۢۜ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۜ᩸;->ۙ()I

    move-result v0

    return v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 359
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۙ()Ll/ۢۜ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۜ᩸;->᩷()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getFilePath()Ljava/lang/String;
    .locals 1

    .line 365
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۙ()Ll/ۢۜ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۜ᩸;->ۤ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getHighlightColorAt(I)I
    .locals 4

    .line 332
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v1

    if-ltz p1, :cond_0

    if-ge p1, v1, :cond_0

    .line 336
    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۙ(I)I

    move-result p1

    return p1

    .line 334
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Index: "

    const-string v3, ", Length: "

    .line 0
    invoke-static {v2, p1, v1, v3}, Ll/ۜۚ᩸;->ۙ(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 334
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getLineColumnFromPosition(I[I)Z
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 109
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1, p2}, Ll/᩺ۜ᩸;->ۙ(I[I)Z

    move-result p1

    return p1
.end method

.method public final getLineColumnFromPosition(I)[I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 100
    iget-object v1, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v1, p1, v0}, Ll/᩺ۜ᩸;->ۙ(I[I)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final getPageCount()I
    .locals 1

    .line 266
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۙ()Ll/ۢۜ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۜ᩸;->᩸()I

    move-result v0

    return v0
.end method

.method public final getPositionFromLineColumn(II)I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 92
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1, p2}, Ll/᩺ۜ᩸;->ۤ(II)I

    move-result p1

    return p1
.end method

.method public final getRawSelectionEnd()I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 57
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    return v0
.end method

.method public final getRawSelectionStart()I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 51
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v0

    return v0
.end method

.method public final getSelectedText()Ljava/lang/String;
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 190
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v1

    .line 191
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    if-ne v1, v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    if-ge v1, v0, :cond_2

    .line 196
    invoke-virtual {p0, v1, v0}, Ll/᩻֨᩸;->subText(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 198
    :cond_2
    invoke-virtual {p0, v0, v1}, Ll/᩻֨᩸;->subText(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSelectionEnd()I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 45
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final getSelectionStart()I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 39
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final getSyntaxName()Ljava/lang/String;
    .locals 1

    .line 347
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    .line 9231
    iget-object v0, v0, Ll/᩺ۜ᩸;->۠᩸:Ll/֨ܽᩴ;

    invoke-virtual {v0}, Ll/֨ܽᩴ;->ۚ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSyntaxStyleColor(Ljava/lang/String;)I
    .locals 3

    .line 9200
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    iget-object v1, v0, Ll/᩺ۜ᩸;->۠᩸:Ll/֨ܽᩴ;

    iget-object v0, v0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget-boolean v2, v0, Ll/ܰۤᩴ;->ۙۤ:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ll/֨ܽᩴ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 9201
    invoke-static {p1}, Ll/ܽ᩻ᩴ;->ۙ(Ljava/lang/String;)I

    move-result p1

    .line 9202
    invoke-virtual {v1}, Ll/֨ܽᩴ;->۫()Ll/ܺۧᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܺۧᩴ;->ۙ(I)Ll/ۧ᩻ᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧ᩻ᩴ;->ܽ()I

    move-result p1

    return p1

    .line 9204
    :cond_0
    invoke-virtual {v0}, Ll/ۚۚܺ;->ܶ()I

    move-result p1

    return p1
.end method

.method public final getTabSize()I
    .locals 1

    .line 287
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    .line 4718
    iget-object v0, v0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v0}, Ll/ۚۚܺ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final getTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 353
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    iget-object v0, v0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget-object v0, v0, Ll/ۚۚܺ;->۠:Ll/ۢܺۤ;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public final hasTextSelected()Z
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 63
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final insertText(ILjava/lang/CharSequence;)V
    .locals 0

    .line 179
    invoke-virtual {p0, p1, p1, p2}, Ll/᩻֨᩸;->replaceText(IILjava/lang/CharSequence;)V

    return-void
.end method

.method public final isChanged()Z
    .locals 1

    .line 370
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۙ()Ll/ۢۜ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۜ᩸;->ᩴ()Z

    move-result v0

    return v0
.end method

.method public final isEditTextView()Z
    .locals 1

    .line 403
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    instance-of v0, v0, Ll/᩹ۖ᩸;

    return v0
.end method

.method public final isFocused()Z
    .locals 1

    .line 380
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v0

    return v0
.end method

.method public final isIndentWithTabs()Z
    .locals 1

    .line 292
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ᩳ᩷()Z

    move-result v0

    return v0
.end method

.method public final isPaginationMode()Z
    .locals 1

    .line 261
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۙ()Ll/ۢۜ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۜ᩸;->ܳ()Z

    move-result v0

    return v0
.end method

.method public final isReadOnly()Z
    .locals 1

    .line 282
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result v0

    return v0
.end method

.method public final length()I
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 211
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    return v0
.end method

.method public final pushSelectionToUndoBuffer()V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 86
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    const/4 v1, 0x0

    .line 1061
    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->᩸(Z)V

    return-void
.end method

.method public final replaceText(IILjava/lang/CharSequence;)V
    .locals 6

    const/4 v4, 0x0

    .line 174
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Ll/᩻֨᩸;->replaceText(IILjava/lang/CharSequence;II)V

    return-void
.end method

.method public final replaceText(IILjava/lang/CharSequence;II)V
    .locals 7

    .line 165
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    .line 51
    invoke-virtual {v0, p1, p2}, Ll/ۢ᩶᩸;->delete(II)V

    .line 52
    invoke-virtual {v0, p1, p4, p5, p3}, Ll/ۢ᩶᩸;->ۙ(IIILjava/lang/CharSequence;)V

    return-void

    .line 168
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    return-void
.end method

.method public final requestFocus()Z
    .locals 1

    .line 385
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v0

    return v0
.end method

.method public final requestFocusAndShowIME()Z
    .locals 2

    .line 390
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Landroid/view/View;->isFocusable()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 393
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 394
    invoke-static {v0}, Ll/᩶᩷ۧ;->ۤ(Landroid/view/View;)V

    goto :goto_0

    .line 396
    :cond_1
    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final save(Lbin/mt/plugin/api/util/ResultCallback;)V
    .locals 1

    .line 375
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۙ()Ll/ۢۜ᩸;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢۜ᩸;->ۙ(Lbin/mt/plugin/api/util/ResultCallback;)V

    return-void
.end method

.method public final setSelection(I)V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 75
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->᩹(I)V

    return-void
.end method

.method public final setSelection(II)V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 69
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1, p2}, Ll/᩺ۜ᩸;->ۧ(II)V

    return-void
.end method

.method public final showCursor()V
    .locals 1

    .line 80
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->֫᩸()V

    return-void
.end method

.method public final showFloatingMenu()V
    .locals 2

    .line 319
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    const/4 v1, -0x1

    .line 2503
    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ۛ(I)V

    return-void
.end method

.method public final showFloatingMenu(I)V
    .locals 1

    const/4 v0, -0x1

    if-ge p1, v0, :cond_0

    const/4 p1, -0x1

    .line 327
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۛ(I)V

    return-void
.end method

.method public final startLargeBatchEditingMode()V
    .locals 2

    .line 223
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 226
    iput-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    .line 227
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    iput-object v1, p0, Ll/᩻֨᩸;->ۙ:Ll/ᩳ۬᩸;

    .line 228
    new-instance v1, Ll/֫֨᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ll/֫֨᩸;-><init>(Ll/᩻֨᩸;Ll/ᩳ۬᩸;)V

    iput-object v1, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    return-void

    .line 224
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final subText(II)Ljava/lang/String;
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 205
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/ۡ᩶᩸;->᩷(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final switchToPage(ILbin/mt/plugin/api/util/ResultCallback;)V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻֨᩸;->ᩴ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iget-object v0, p0, Ll/᩻֨᩸;->᩷:Ll/ۢ᩶᩸;

    invoke-virtual {v0}, Ll/ۢ᩶᩸;->ۤ()V

    .line 277
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩸;->ۤ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۙ()Ll/ۢۜ᩸;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ۢۜ᩸;->ۙ(ILbin/mt/plugin/api/util/ResultCallback;)V

    return-void
.end method
