.class public final Ll/᩻ܳᩴ;
.super Ll/ۖۙܺ;
.source "N7PP"


# instance fields
.field public final synthetic ֫:Z

.field public final synthetic ۗ:I

.field public final synthetic ۚ:Ll/ܽ֡֫;

.field public final synthetic ۛ:I

.field public final synthetic ۧ:Ll/᩺ۜ᩸;

.field public final synthetic ۨ:[I

.field public final synthetic ۫:Ll/ܶܳᩴ;

.field public ܳ:Ll/ܿ۬᩸;

.field public final synthetic ܶ:Z

.field public final synthetic ܺ:Ll/ᩳ۬᩸;

.field public final synthetic ܽ:Ll/ܿܶۤ;

.field public final synthetic ᩵:Ll/۟۬᩸;

.field public final synthetic ᩹:Ljava/lang/String;

.field public final synthetic ᩺:I

.field public final synthetic ᩻:Ll/᩺۬᩹;


# direct methods
.method public constructor <init>(Ll/ܶܳᩴ;Ll/۟۬᩸;Ll/ᩳ۬᩸;ILl/ܿܶۤ;I[ILjava/lang/String;ZIZLl/᩺۬᩹;Ll/᩺ۜ᩸;Ll/ܽ֡֫;)V
    .locals 0

    .line 108
    iput-object p1, p0, Ll/᩻ܳᩴ;->۫:Ll/ܶܳᩴ;

    iput-object p2, p0, Ll/᩻ܳᩴ;->᩵:Ll/۟۬᩸;

    iput-object p3, p0, Ll/᩻ܳᩴ;->ܺ:Ll/ᩳ۬᩸;

    iput p4, p0, Ll/᩻ܳᩴ;->᩺:I

    iput-object p5, p0, Ll/᩻ܳᩴ;->ܽ:Ll/ܿܶۤ;

    iput p6, p0, Ll/᩻ܳᩴ;->ۛ:I

    iput-object p7, p0, Ll/᩻ܳᩴ;->ۨ:[I

    iput-object p8, p0, Ll/᩻ܳᩴ;->᩹:Ljava/lang/String;

    iput-boolean p9, p0, Ll/᩻ܳᩴ;->ܶ:Z

    iput p10, p0, Ll/᩻ܳᩴ;->ۗ:I

    iput-boolean p11, p0, Ll/᩻ܳᩴ;->֫:Z

    iput-object p12, p0, Ll/᩻ܳᩴ;->᩻:Ll/᩺۬᩹;

    iput-object p13, p0, Ll/᩻ܳᩴ;->ۧ:Ll/᩺ۜ᩸;

    iput-object p14, p0, Ll/᩻ܳᩴ;->ۚ:Ll/ܽ֡֫;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 4

    .line 149
    iget-object v0, p0, Ll/᩻ܳᩴ;->᩵:Ll/۟۬᩸;

    invoke-virtual {v0}, Ll/۟۬᩸;->ۙ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 150
    :cond_0
    iget-object v0, p0, Ll/᩻ܳᩴ;->ܳ:Ll/ܿ۬᩸;

    invoke-virtual {v0}, Ll/ܿ۬᩸;->count()I

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    iget-object v0, p0, Ll/᩻ܳᩴ;->ܳ:Ll/ܿ۬᩸;

    iget-object v1, p0, Ll/᩻ܳᩴ;->ܺ:Ll/ᩳ۬᩸;

    iget-boolean v2, p0, Ll/᩻ܳᩴ;->֫:Z

    iget-object v3, p0, Ll/᩻ܳᩴ;->ۧ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, v3, v1, v2}, Ll/ܿ۬᩸;->ۙ(Ll/᩺ۜ᩸;Ll/ᩳ۬᩸;Z)V

    .line 152
    iget-object v0, p0, Ll/᩻ܳᩴ;->ܳ:Ll/ܿ۬᩸;

    invoke-virtual {v0}, Ll/ܿ۬᩸;->count()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const v0, 0x7f120a56

    invoke-static {v0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(Ljava/lang/CharSequence;)Ll/᩸۠ۧ;

    return-void

    :cond_1
    const v0, 0x7f120c2b

    .line 154
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 160
    iget-object v0, p0, Ll/᩻ܳᩴ;->᩵:Ll/۟۬᩸;

    invoke-virtual {v0}, Ll/۟۬᩸;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 161
    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_1

    .line 162
    iget-object v0, p0, Ll/᩻ܳᩴ;->ۚ:Ll/ܽ֡֫;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩴ()V
    .locals 10

    .line 118
    iget-object v0, p0, Ll/᩻ܳᩴ;->᩵:Ll/۟۬᩸;

    invoke-virtual {v0}, Ll/۟۬᩸;->᩸()V

    .line 119
    new-instance v7, Ll/֫۬᩸;

    invoke-direct {v7, v0}, Ll/֫۬᩸;-><init>(Ll/۟۬᩸;)V

    .line 120
    iget-object v1, p0, Ll/᩻ܳᩴ;->ܺ:Ll/ᩳ۬᩸;

    invoke-interface {v1}, Ll/ۡ᩶᩸;->ۘ()Ll/ܳܿ᩸;

    move-result-object v9

    .line 121
    :try_start_0
    invoke-virtual {v9, v7}, Ll/ܳܿ᩸;->᩷(Ljava/lang/Runnable;)V

    .line 122
    invoke-virtual {v0}, Ll/۟۬᩸;->᩸()V

    .line 123
    invoke-virtual {v9}, Ll/ܳܿ᩸;->ܳ()I

    move-result v1

    iget v2, p0, Ll/᩻ܳᩴ;->᩺:I

    if-ne v1, v2, :cond_4

    .line 124
    iget-object v1, p0, Ll/᩻ܳᩴ;->ܽ:Ll/ܿܶۤ;

    invoke-virtual {v1, v9}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object v2

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Ll/ۘܶۤ;->᩷(Z)V

    .line 125
    invoke-virtual {v2, v7}, Ll/ۘܶۤ;->ۙ(Ljava/lang/Runnable;)V

    .line 126
    iget v3, p0, Ll/᩻ܳᩴ;->ۛ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v4, p0, Ll/᩻ܳᩴ;->ۨ:[I

    const/4 v5, 0x1

    if-ne v3, v5, :cond_0

    .line 127
    :try_start_1
    aget v3, v4, v1

    const/16 v6, 0xa

    invoke-virtual {v9, v6, v1, v3}, Ll/ܳܿ᩸;->lastIndexOf(CII)I

    move-result v3

    add-int/2addr v3, v5

    aput v3, v4, v1

    .line 128
    aget v3, v4, v5

    invoke-virtual {v9}, Ll/ܳܿ᩸;->length()I

    move-result v8

    invoke-virtual {v9, v6, v3, v8}, Ll/ܳܿ᩸;->indexOf(CII)I

    move-result v3

    aput v3, v4, v5

    const/4 v6, -0x1

    if-ne v3, v6, :cond_3

    .line 129
    invoke-virtual {v9}, Ll/ܳܿ᩸;->length()I

    move-result v3

    aput v3, v4, v5

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    if-ne v3, v6, :cond_1

    .line 131
    aget v3, v4, v1

    aput v3, v4, v5

    .line 132
    aput v1, v4, v1

    goto :goto_0

    :cond_1
    const/4 v6, 0x3

    if-ne v3, v6, :cond_2

    .line 134
    aget v3, v4, v5

    aput v3, v4, v1

    .line 135
    invoke-virtual {v9}, Ll/ܳܿ᩸;->length()I

    move-result v3

    aput v3, v4, v5

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    .line 137
    aput v1, v4, v1

    .line 138
    invoke-virtual {v9}, Ll/ܳܿ᩸;->length()I

    move-result v3

    aput v3, v4, v5

    .line 140
    :cond_3
    :goto_0
    aget v1, v4, v1

    aget v3, v4, v5

    invoke-virtual {v2, v1, v3}, Ll/ۘܶۤ;->region(II)V

    .line 141
    iget-object v3, p0, Ll/᩻ܳᩴ;->᩹:Ljava/lang/String;

    iget-boolean v4, p0, Ll/᩻ܳᩴ;->ܶ:Z

    iget v5, p0, Ll/᩻ܳᩴ;->ۗ:I

    iget-boolean v6, p0, Ll/᩻ܳᩴ;->֫:Z

    iget-object v1, p0, Ll/᩻ܳᩴ;->᩻:Ll/᩺۬᩹;

    new-instance v8, Ll/ۧܳᩴ;

    invoke-direct {v8, v1}, Ll/ۧܳᩴ;-><init>(Ll/᩺۬᩹;)V

    move-object v1, v9

    invoke-static/range {v1 .. v8}, Ll/ܿ۬᩸;->ۙ(Ll/ܳܿ᩸;Ll/ۘܶۤ;Ljava/lang/String;ZIZLjava/lang/Runnable;Ljava/util/function/Supplier;)Ll/ܿ۬᩸;

    move-result-object v1

    iput-object v1, p0, Ll/᩻ܳᩴ;->ܳ:Ll/ܿ۬᩸;

    .line 143
    invoke-virtual {v0}, Ll/۟۬᩸;->᩸()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    invoke-virtual {v9}, Ll/ܳܿ᩸;->close()V

    return-void

    .line 123
    :cond_4
    :try_start_2
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    .line 120
    :try_start_3
    invoke-virtual {v9}, Ll/ܳܿ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
.end method

.method public final ᩷()V
    .locals 2

    .line 113
    iget-object v0, p0, Ll/᩻ܳᩴ;->۫:Ll/ܶܳᩴ;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ll/ܶܳᩴ;->ۙ(Ll/ܶܳᩴ;Z)V

    return-void
.end method

.method public final ᩸()V
    .locals 4

    .line 169
    iget-object v0, p0, Ll/᩻ܳᩴ;->۫:Ll/ܶܳᩴ;

    iget-object v1, p0, Ll/᩻ܳᩴ;->᩵:Ll/۟۬᩸;

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Ll/᩻ܳᩴ;->ܳ:Ll/ܿ۬᩸;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ll/ܿ۬᩸;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    :cond_0
    invoke-virtual {v1}, Ll/۟۬᩸;->ᩴ()V

    .line 172
    invoke-static {v0, v2}, Ll/ܶܳᩴ;->ۙ(Ll/ܶܳᩴ;Z)V

    return-void

    :catchall_0
    move-exception v3

    .line 171
    invoke-virtual {v1}, Ll/۟۬᩸;->ᩴ()V

    .line 172
    invoke-static {v0, v2}, Ll/ܶܳᩴ;->ۙ(Ll/ܶܳᩴ;Z)V

    .line 173
    throw v3
.end method
