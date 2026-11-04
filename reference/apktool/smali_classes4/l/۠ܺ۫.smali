.class public Ll/۠ܺ۫;
.super Ll/ᩴۙ᩻;
.source "J951"


# static fields
.field public static final synthetic ۗۙ:I


# instance fields
.field public ܶۙ:Ljava/lang/String;

.field public ᩹ۙ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 152
    invoke-direct {p0}, Ll/ᩴۙ᩻;-><init>()V

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠ܺ۫;->᩹ۙ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const v0, 0x7f120236

    .line 169
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩻(I)V

    const-string v0, "..."

    .line 170
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Lbin/mt/plus/Main;Ll/۠ۨܳ;Ll/۠ۨܳ;Ll/ۨۜۧ;)V
    .locals 0

    .line 235
    iget-object p1, p0, Ll/۠ܺ۫;->᩹ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0, p2}, Ll/ᩳۜۧ;->᩷(Ll/۠ۨܳ;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 301
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result p3

    if-nez p3, :cond_0

    .line 237
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܳ()V

    .line 239
    :cond_0
    invoke-virtual {p2, p1}, Ll/۠ۨܳ;->ۙ(Ljava/util/Collection;)V

    .line 240
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܽۙ()V

    :cond_1
    return-void
.end method

.method public final ۧ()Ll/ۨۜۧ;
    .locals 17

    move-object/from16 v1, p0

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {v1, v0}, Ll/ᩳۜۧ;->ۗ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 176
    invoke-static {v0}, Ll/ܰۨᩴ;->ۙ([Ljava/lang/String;)[Ll/᩷ۨᩴ;

    move-result-object v0

    .line 177
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 179
    invoke-virtual/range {p0 .. p0}, Ll/ᩴۙ᩻;->ۢۙ()V

    :cond_1
    const-string v4, "password"

    .line 181
    invoke-virtual {v1, v4}, Ll/ᩳۜۧ;->᩹(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "removeSource"

    .line 182
    invoke-virtual {v1, v5}, Ll/ᩳۜۧ;->ۤ(Ljava/lang/String;)Z

    move-result v5

    .line 183
    sget v6, Ll/ۗܽܺ;->ۢ:I

    .line 75
    :try_start_0
    sget-boolean v6, Ll/ܽܽܺ;->ۙ:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    array-length v6, v0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    :goto_1
    const/16 v10, 0x14

    if-ge v9, v6, :cond_2

    aget-object v11, v0, v9

    .line 187
    invoke-virtual {v11}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v11

    int-to-long v13, v10

    sub-long/2addr v11, v13

    add-long/2addr v7, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 189
    :cond_2
    new-instance v6, Ll/ۗۧܺ;

    invoke-direct {v6, v7, v8}, Ll/ۗۧܺ;-><init>(J)V

    const/4 v7, 0x5

    if-nez v2, :cond_3

    .line 191
    new-instance v8, Ll/ᩳ᩺ۤ;

    invoke-direct {v8, v7, v1}, Ll/ᩳ᩺ۤ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v6, v8}, Ll/ۗۧܺ;->ۙ(Ll/ܽۧܺ;)V

    .line 193
    :cond_3
    array-length v8, v0

    :goto_2
    if-ge v3, v8, :cond_a

    aget-object v9, v0, v3

    .line 194
    invoke-virtual {v9}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v11

    iput-object v11, v1, Ll/۠ܺ۫;->ܶۙ:Ljava/lang/String;

    .line 195
    invoke-virtual {v1, v11}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    const-string v12, ".encrypt"

    .line 196
    invoke-virtual {v11, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-virtual {v9}, Ll/᩷ۨᩴ;->᩷ۙ()Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    :cond_4
    const-string v12, ".decrypt"

    invoke-virtual {v11, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    :goto_3
    invoke-virtual {v9, v11}, Ll/᩷ۨᩴ;->ᩴ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v11

    .line 197
    invoke-virtual {v11}, Ll/᩷ۨᩴ;->֨()Z

    move-result v12

    if-eqz v12, :cond_5

    const-string v12, ".tmp"

    .line 899
    invoke-virtual {v11, v12}, Ll/᩷ۨᩴ;->ܳ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v12

    goto :goto_4

    :cond_5
    move-object v12, v11

    .line 198
    :goto_4
    new-instance v13, Ll/ۗۧܺ;

    invoke-virtual {v9}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v14

    move-object/from16 v16, v11

    int-to-long v10, v10

    sub-long/2addr v14, v10

    invoke-direct {v13, v14, v15}, Ll/ۗۧܺ;-><init>(J)V

    if-eqz v2, :cond_6

    .line 200
    new-instance v10, Ll/ᩳ᩺ۤ;

    invoke-direct {v10, v7, v1}, Ll/ᩳ᩺ۤ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v13, v10}, Ll/ۗۧܺ;->ۙ(Ll/ܽۧܺ;)V

    goto :goto_5

    .line 202
    :cond_6
    new-instance v7, Ll/ۡ᩺ۤ;

    invoke-direct {v7, v1}, Ll/ۡ᩺ۤ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v13, v7}, Ll/ۗۧܺ;->ۙ(Ll/ܽۧܺ;)V

    .line 204
    :goto_5
    new-instance v7, Ll/ۗܽܺ;

    new-instance v10, Ll/ۡ᩶ۙ;

    const/4 v11, 0x1

    invoke-direct {v10, v11, v9}, Ll/ۡ᩶ۙ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v7, v9, v4, v10}, Ll/ۗܽܺ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;Ll/ۜۙܽ;)V

    .line 205
    :try_start_1
    invoke-virtual {v7}, Ll/ۗܽܺ;->ۙ()J

    move-result-wide v10

    new-instance v14, Ll/ۖܺ۫;

    invoke-direct {v14, v1, v13, v6}, Ll/ۖܺ۫;-><init>(Ll/۠ܺ۫;Ll/ۗۧܺ;Ll/ۗۧܺ;)V

    invoke-virtual {v12, v7, v10, v11, v14}, Ll/᩷ۨᩴ;->ۙ(Ljava/io/InputStream;JLl/᩹ܿᩴ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 217
    invoke-virtual {v7}, Ll/ۗܽܺ;->close()V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v7

    if-eqz v7, :cond_7

    .line 219
    invoke-virtual {v12}, Ll/᩷ۨᩴ;->ۢ()Z

    goto :goto_7

    :cond_7
    move-object/from16 v7, v16

    if-eq v12, v7, :cond_8

    const/4 v10, 0x0

    .line 991
    invoke-virtual {v12, v7, v10}, Ll/᩷ۨᩴ;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/Runnable;)V

    .line 225
    :cond_8
    iget-object v10, v1, Ll/۠ܺ۫;->᩹ۙ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_9

    .line 227
    invoke-virtual {v9}, Ll/᩷ۨᩴ;->ۢ()Z

    :cond_9
    add-int/lit8 v3, v3, 0x1

    const/4 v7, 0x5

    const/16 v10, 0x14

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 204
    :try_start_2
    invoke-virtual {v7}, Ll/ۗܽܺ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2

    .line 230
    :cond_a
    :goto_7
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->ᩳۙ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 77
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ܶۙ()Ljava/lang/CharSequence;
    .locals 2

    .line 163
    iget-object v0, p0, Ll/۠ܺ۫;->ܶۙ:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "null"

    :cond_0
    const v1, 0x7f120c54

    .line 651
    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v1

    .line 164
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120bf6

    .line 655
    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ll/ۨۜۧ;)V
    .locals 0

    .line 246
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    return-void
.end method

.method public final ᩺()Ll/ۨ֡֫;
    .locals 1

    .line 158
    sget-object v0, Ll/ܰ۬ۧ;->ܳ:Ll/ۨ֡֫;

    return-object v0
.end method
