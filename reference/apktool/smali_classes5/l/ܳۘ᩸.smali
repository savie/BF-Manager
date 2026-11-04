.class public final synthetic Ll/ܳۘ᩸;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/ۢۗ᩸;


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۗ:Ll/᩺۬᩹;

.field public final synthetic ۘ:Ll/ۚ᩶᩸;

.field public final synthetic ۙ:Ll/۟ܰ᩸;

.field public final synthetic ۚ:Ll/ۡܰ᩸;

.field public final synthetic ۛ:[B

.field public final synthetic ۤ:Ll/ᩳ᩵᩸;

.field public final synthetic ۧ:Z

.field public final synthetic ۨ:Ll/ۨۤᩴ;

.field public final synthetic ۫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ܳ:Z

.field public final synthetic ܶ:Landroid/graphics/Point;

.field public final synthetic ܺ:Ll/᩹ܽ᩵;

.field public final synthetic ܽ:Landroid/graphics/Point;

.field public final synthetic ᩴ:Ljava/lang/String;

.field public final synthetic ᩵:Landroid/os/Bundle;

.field public final synthetic ᩷:Ll/ۜۗ᩸;

.field public final synthetic ᩸:Ll/᩺۬᩹;

.field public final synthetic ᩹:Z

.field public final synthetic ᩺:[B

.field public final synthetic ᩻:Z


# direct methods
.method public synthetic constructor <init>(Ll/۟ܰ᩸;Ll/ۜۗ᩸;Ll/᩹ܽ᩵;ZLl/᩺۬᩹;Landroid/os/Bundle;Ll/ۨۤᩴ;[B[BLl/ۚ᩶᩸;Ll/ᩳ᩵᩸;Ll/᩺۬᩹;Ljava/lang/String;ZLjava/util/concurrent/atomic/AtomicBoolean;Ll/ۡܰ᩸;IZZLandroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 2

    move-object v0, p0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Ll/ܳۘ᩸;->ۙ:Ll/۟ܰ᩸;

    move-object v1, p2

    iput-object v1, v0, Ll/ܳۘ᩸;->᩷:Ll/ۜۗ᩸;

    move-object v1, p3

    iput-object v1, v0, Ll/ܳۘ᩸;->ܺ:Ll/᩹ܽ᩵;

    move v1, p4

    iput-boolean v1, v0, Ll/ܳۘ᩸;->᩹:Z

    move-object v1, p5

    iput-object v1, v0, Ll/ܳۘ᩸;->ۗ:Ll/᩺۬᩹;

    move-object v1, p6

    iput-object v1, v0, Ll/ܳۘ᩸;->᩵:Landroid/os/Bundle;

    move-object v1, p7

    iput-object v1, v0, Ll/ܳۘ᩸;->ۨ:Ll/ۨۤᩴ;

    move-object v1, p8

    iput-object v1, v0, Ll/ܳۘ᩸;->ۛ:[B

    move-object v1, p9

    iput-object v1, v0, Ll/ܳۘ᩸;->᩺:[B

    move-object v1, p10

    iput-object v1, v0, Ll/ܳۘ᩸;->ۘ:Ll/ۚ᩶᩸;

    move-object v1, p11

    iput-object v1, v0, Ll/ܳۘ᩸;->ۤ:Ll/ᩳ᩵᩸;

    move-object v1, p12

    iput-object v1, v0, Ll/ܳۘ᩸;->᩸:Ll/᩺۬᩹;

    move-object v1, p13

    iput-object v1, v0, Ll/ܳۘ᩸;->ᩴ:Ljava/lang/String;

    move/from16 v1, p14

    iput-boolean v1, v0, Ll/ܳۘ᩸;->ܳ:Z

    move-object/from16 v1, p15

    iput-object v1, v0, Ll/ܳۘ᩸;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object/from16 v1, p16

    iput-object v1, v0, Ll/ܳۘ᩸;->ۚ:Ll/ۡܰ᩸;

    move/from16 v1, p17

    iput v1, v0, Ll/ܳۘ᩸;->֫:I

    move/from16 v1, p18

    iput-boolean v1, v0, Ll/ܳۘ᩸;->ۧ:Z

    move/from16 v1, p19

    iput-boolean v1, v0, Ll/ܳۘ᩸;->᩻:Z

    move-object/from16 v1, p20

    iput-object v1, v0, Ll/ܳۘ᩸;->ܽ:Landroid/graphics/Point;

    move-object/from16 v1, p21

    iput-object v1, v0, Ll/ܳۘ᩸;->ܶ:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۟֡֫;)Ll/ܶ᩵᩸;
    .locals 17

    move-object/from16 v1, p0

    .line 4
    iget-object v0, v1, Ll/ܳۘ᩸;->۫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    iget-boolean v5, v1, Ll/ܳۘ᩸;->ۧ:Z

    .line 8
    iget-boolean v6, v1, Ll/ܳۘ᩸;->᩻:Z

    const-string v2, "waiting_legacy_writes"

    .line 1615
    iget-object v3, v1, Ll/ܳۘ᩸;->᩷:Ll/ۜۗ᩸;

    invoke-virtual {v3, v2}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 1616
    iget-object v2, v1, Ll/ܳۘ᩸;->ܺ:Ll/᩹ܽ᩵;

    invoke-virtual {v2}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;

    const-string v2, "opening_session_storage"

    .line 1617
    invoke-virtual {v3, v2}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 1619
    iget-boolean v2, v1, Ll/ܳۘ᩸;->᩹:Z

    iget-object v4, v1, Ll/ܳۘ᩸;->ۗ:Ll/᩺۬᩹;

    iget-object v15, v1, Ll/ܳۘ᩸;->ۤ:Ll/ᩳ᩵᩸;

    iget-object v14, v1, Ll/ܳۘ᩸;->᩸:Ll/᩺۬᩹;

    iget-object v13, v1, Ll/ܳۘ᩸;->ᩴ:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-static {v4}, Ll/ۢ᩵᩸;->ۙ(Ll/᩺۬᩹;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Ll/ܳۘ᩸;->ۙ:Ll/۟ܰ᩸;

    invoke-virtual {v2}, Ll/ۜܽ᩸;->ܳ()Ll/᩷ۨᩴ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1620
    iget-object v8, v1, Ll/ܳۘ᩸;->᩵:Landroid/os/Bundle;

    iget-object v9, v1, Ll/ܳۘ᩸;->ۨ:Ll/ۨۤᩴ;

    iget-object v10, v1, Ll/ܳۘ᩸;->ۛ:[B

    iget-object v11, v1, Ll/ܳۘ᩸;->᩺:[B

    iget-object v12, v1, Ll/ܳۘ᩸;->ۘ:Ll/ۚ᩶᩸;

    move-object v7, v4

    move-object v2, v13

    move-object v13, v15

    move/from16 v16, v6

    move-object v6, v14

    move-object/from16 v14, p1

    invoke-static/range {v7 .. v14}, Ll/ܰ᩹᩸;->ۙ(Ll/᩺۬᩹;Landroid/os/Bundle;Ll/ۨۤᩴ;[B[BLl/ۚ᩶᩸;Ll/ᩳ᩵᩸;Ll/۟֡֫;)Ll/ܶ᩵᩸;

    move-result-object v7

    move-object/from16 v13, p1

    goto :goto_0

    :cond_0
    move/from16 v16, v6

    move-object v2, v13

    move-object v6, v14

    move-object/from16 v13, p1

    .line 1622
    invoke-static {v6, v2, v15, v13}, Ll/ۢ᩵᩸;->ۙ(Ll/᩺۬᩹;Ljava/lang/String;Ll/ᩳ᩵᩸;Ll/۟֡֫;)Ll/ܶ᩵᩸;

    move-result-object v7

    :goto_0
    move-object v14, v7

    .line 1623
    iput-object v3, v14, Ll/ܶ᩵᩸;->ۧ:Ll/ۜۗ᩸;

    .line 1624
    iget-boolean v7, v1, Ll/ܳۘ᩸;->ܳ:Z

    if-eqz v7, :cond_1

    const-string v8, "preparing_source"

    goto :goto_1

    :cond_1
    const-string v8, "reloading_source"

    :goto_1
    invoke-virtual {v3, v8}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    .line 1626
    iget-object v8, v1, Ll/ܳۘ᩸;->ۚ:Ll/ۡܰ᩸;

    iget v11, v1, Ll/ܳۘ᩸;->֫:I

    const/4 v3, 0x1

    const/4 v12, 0x0

    const/4 v9, 0x0

    if-eqz v7, :cond_6

    .line 1628
    :try_start_0
    iget-object v2, v14, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v2, v2, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v2}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v2

    const-string v5, "e2SourcePending"

    .line 1629
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v0, "filePath"

    .line 1630
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 63
    iget-object v5, v8, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v5

    .line 1632
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v9, v8

    goto :goto_2

    .line 1633
    :cond_2
    new-instance v5, Ll/ۡܰ᩸;

    new-array v6, v9, [Ljava/lang/String;

    invoke-static {v0, v6}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-direct {v5, v0}, Ll/ۡܰ᩸;-><init>(Ll/᩷ۨᩴ;)V

    move-object v9, v5

    :goto_2
    const-string v0, "forceTryAXml"

    .line 1634
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_4

    :try_start_1
    const-string v0, "forceTryClass"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    goto :goto_4

    :cond_3
    const/4 v0, 0x0

    const/4 v10, 0x0

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v15, v12

    goto/16 :goto_f

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    :goto_3
    move-object v2, v0

    move-object v15, v12

    goto/16 :goto_d

    :cond_4
    :goto_4
    const/4 v10, 0x1

    :goto_5
    const/4 v0, 0x1

    move-object v7, v14

    move-object v8, v4

    move-object v4, v12

    move-object v12, v15

    move-object/from16 v13, p1

    move-object v3, v14

    move v14, v0

    .line 1635
    :try_start_2
    invoke-virtual/range {v7 .. v14}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/ۖܰ᩸;ZILl/ᩳ᩵᩸;Ll/۟֡֫;Z)Ll/ܶ᩵᩸;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 1648
    iput-object v4, v3, Ll/ܶ᩵᩸;->ۧ:Ll/ۜۗ᩸;

    return-object v0

    :catch_2
    move-exception v0

    :goto_6
    move-object v4, v12

    move-object v3, v14

    goto :goto_7

    :catch_3
    move-exception v0

    goto :goto_6

    :cond_5
    move-object v4, v12

    move-object v3, v14

    .line 1631
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Session source path is missing"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    move-object v4, v12

    move-object v3, v14

    goto/16 :goto_b

    :goto_7
    move-object v14, v3

    move-object v15, v4

    goto/16 :goto_c

    :cond_6
    move-object v4, v12

    move-object v3, v14

    .line 1638
    sget v0, Ll/ۗ۬᩸;->֫:I

    .line 499
    sget-object v0, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    const-string v7, "text_page_size"

    const v9, 0x1312d00

    invoke-interface {v0, v7, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 1638
    invoke-virtual {v3, v0}, Ll/ܶ᩵᩸;->ۙ(I)V

    .line 1639
    invoke-static {v2, v6}, Ll/֨ܶ᩸;->᩷(Ljava/lang/String;Ll/᩺۬᩹;)Ll/᩺۬᩹;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1640
    iget-object v2, v1, Ll/ܳۘ᩸;->ܽ:Landroid/graphics/Point;

    iget-object v6, v1, Ll/ܳۘ᩸;->ܶ:Landroid/graphics/Point;

    if-nez v2, :cond_7

    const/4 v7, 0x0

    const/4 v9, 0x0

    goto :goto_8

    :cond_7
    :try_start_4
    iget v7, v6, Landroid/graphics/Point;->x:I

    move v9, v7

    :goto_8
    if-nez v2, :cond_8

    const/4 v6, 0x0

    const/4 v10, 0x0

    goto :goto_9

    :cond_8
    iget v6, v6, Landroid/graphics/Point;->y:I

    move v10, v6

    :goto_9
    if-eqz v2, :cond_9

    iget v2, v2, Landroid/graphics/Point;->x:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const/4 v6, -0x1

    if-eq v2, v6, :cond_9

    const/4 v2, 0x1

    const/4 v12, 0x1

    goto :goto_a

    :cond_9
    const/4 v2, 0x0

    const/4 v12, 0x0

    :goto_a
    move-object v2, v3

    move-object v14, v3

    move-object v3, v0

    move-object v7, v4

    move-object v4, v8

    move/from16 v6, v16

    move-object v8, v7

    move v7, v11

    move-object v11, v8

    move v8, v9

    move v9, v10

    move-object v10, v15

    move-object v15, v11

    move-object/from16 v11, p1

    .line 1639
    :try_start_5
    invoke-virtual/range {v2 .. v12}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/ۡܰ᩸;ZZIIILl/ᩳ᩵᩸;Ll/۟֡֫;Z)Ll/ܶ᩵᩸;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1648
    iput-object v15, v14, Ll/ܶ᩵᩸;->ۧ:Ll/ۜۗ᩸;

    return-object v0

    :catchall_2
    move-exception v0

    goto :goto_f

    :catch_4
    move-exception v0

    goto :goto_c

    :catch_5
    move-exception v0

    goto :goto_c

    :catch_6
    move-exception v0

    goto :goto_7

    :catch_7
    move-exception v0

    goto :goto_7

    :catchall_3
    move-exception v0

    :goto_b
    move-object v14, v3

    move-object v15, v4

    goto :goto_f

    :goto_c
    move-object v2, v0

    .line 1643
    :goto_d
    :try_start_6
    invoke-virtual {v14}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_e

    :catchall_4
    move-exception v0

    :try_start_7
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1644
    :goto_e
    instance-of v0, v2, Ljava/io/IOException;

    if-nez v0, :cond_c

    .line 1645
    instance-of v0, v2, Ljava/lang/RuntimeException;

    if-nez v0, :cond_b

    .line 1646
    instance-of v0, v2, Ljava/lang/Error;

    if-eqz v0, :cond_a

    check-cast v2, Ljava/lang/Error;

    throw v2

    .line 1647
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Session source reload failed"

    invoke-direct {v0, v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 1645
    :cond_b
    check-cast v2, Ljava/lang/RuntimeException;

    throw v2

    .line 1644
    :cond_c
    check-cast v2, Ljava/io/IOException;

    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1648
    :goto_f
    iput-object v15, v14, Ll/ܶ᩵᩸;->ۧ:Ll/ۜۗ᩸;

    throw v0
.end method
