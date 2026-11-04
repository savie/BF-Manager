.class public final Ll/ۛۨᩴ;
.super Ljava/lang/Object;
.source "D18B"


# static fields
.field public static final ֫:Ll/᩷ۨᩴ;

.field public static final ۙ:Ll/᩷ۨᩴ;

.field public static final ۚ:Ll/᩷ۨᩴ;

.field public static final ۤ:Ll/᩷ۨᩴ;

.field public static final ۧ:Ll/᩷ۨᩴ;

.field public static final ۫:Ll/᩷ۨᩴ;

.field public static ܳ:Ll/᩷ۨᩴ;

.field public static final ᩴ:Ll/᩷ۨᩴ;

.field public static final ᩷:Ll/᩷ۨᩴ;

.field public static final ᩸:Ll/᩷ۨᩴ;

.field public static ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 961
    invoke-static {}, Ll/ܰۨᩴ;->ۙ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    sput-object v0, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    .line 962
    invoke-static {}, Ll/᩶᩷ۧ;->ۚ()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ll/ܰۨᩴ;->ۙ(Ljava/io/File;)Ll/᩷ۨᩴ;

    move-result-object v0

    sput-object v0, Ll/ۛۨᩴ;->ᩴ:Ll/᩷ۨᩴ;

    .line 963
    invoke-static {}, Ll/᩶᩷ۧ;->ۤ()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ll/ܰۨᩴ;->ۙ(Ljava/io/File;)Ll/᩷ۨᩴ;

    move-result-object v0

    sput-object v0, Ll/ۛۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    .line 996
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    .line 998
    invoke-static {}, Ll/᩶᩷ۧ;->ۤ()Ljava/io/File;

    move-result-object v0

    .line 964
    :cond_0
    invoke-static {v0}, Ll/ܰۨᩴ;->ۙ(Ljava/io/File;)Ll/᩷ۨᩴ;

    move-result-object v0

    sput-object v0, Ll/ۛۨᩴ;->ۤ:Ll/᩷ۨᩴ;

    .line 982
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_1

    .line 984
    invoke-static {}, Ll/᩶᩷ۧ;->ۚ()Ljava/io/File;

    move-result-object v1

    .line 965
    :cond_1
    invoke-static {v1}, Ll/ܰۨᩴ;->ۙ(Ljava/io/File;)Ll/᩷ۨᩴ;

    move-result-object v1

    sput-object v1, Ll/ۛۨᩴ;->᩸:Ll/᩷ۨᩴ;

    const-string v2, "temp"

    .line 966
    invoke-virtual {v1, v2}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    sput-object v1, Ll/ۛۨᩴ;->ۚ:Ll/᩷ۨᩴ;

    const-string v3, "CleanOnExit"

    .line 967
    invoke-virtual {v1, v3}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    sput-object v1, Ll/ۛۨᩴ;->ۧ:Ll/᩷ۨᩴ;

    .line 968
    invoke-virtual {v0, v3}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    sput-object v1, Ll/ۛۨᩴ;->᩷:Ll/᩷ۨᩴ;

    .line 972
    invoke-virtual {v0, v2}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    sput-object v0, Ll/ۛۨᩴ;->֫:Ll/᩷ۨᩴ;

    const/4 v0, 0x1

    .line 975
    sput-boolean v0, Ll/ۛۨᩴ;->᩻:Z

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1053
    sget-object v0, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/sdcard"

    .line 1056
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "/"

    if-nez v3, :cond_4

    const-string v3, "/sdcard/"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 1063
    :cond_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    return-object p0

    .line 1064
    :cond_2
    :goto_0
    invoke-static {p0}, Ll/ۛۨᩴ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1065
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object p0

    .line 1069
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    .line 1057
    :cond_4
    :goto_1
    invoke-static {p0}, Ll/ۛۨᩴ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1058
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object p0

    :cond_5
    const/16 v1, 0x8

    .line 1062
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    move-object v1, v2

    .line 0
    :goto_2
    invoke-static {v1, v4}, Ll/ۗۚ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1091
    invoke-virtual {p0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 1092
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-direct {v3, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 p0, 0x0

    .line 1094
    :goto_3
    array-length v4, v2

    if-ge p0, v4, :cond_e

    .line 1095
    aget-object v4, v2, p0

    const/4 v5, 0x0

    .line 1117
    :try_start_0
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۜۙ()Ljava/util/List;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1122
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 1123
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move-object v5, v7

    goto :goto_5

    :cond_7
    if-nez v5, :cond_6

    .line 1126
    invoke-virtual {v7, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    move-object v5, v7

    goto :goto_4

    :catch_0
    nop

    :cond_8
    :goto_5
    const/16 v4, 0x2f

    if-nez v5, :cond_c

    .line 1137
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_9

    .line 1138
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_9
    move v0, p0

    .line 1140
    :goto_6
    array-length v5, v2

    if-ge v0, v5, :cond_b

    if-le v0, p0, :cond_a

    .line 1142
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1144
    :cond_a
    aget-object v5, v2, v0

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 1099
    :cond_b
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_7

    .line 1101
    :cond_c
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_d

    .line 1102
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1104
    :cond_d
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1105
    invoke-virtual {v0, v5}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    add-int/lit8 p0, p0, 0x1

    goto :goto_3

    .line 1107
    :cond_e
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1073
    :goto_7
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ()V
    .locals 3

    .line 413
    sget-object v0, Ll/ۛۨᩴ;->ۧ:Ll/᩷ۨᩴ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v0

    .line 1300
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۨᩴ;

    .line 1301
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ᩳ()Z

    goto :goto_0

    .line 1303
    :cond_0
    sget-object v0, Ll/ۛۨᩴ;->᩷:Ll/᩷ۨᩴ;

    .line 413
    invoke-virtual {v0, v1}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v0

    .line 1303
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۨᩴ;

    .line 1304
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ᩳ()Z

    goto :goto_1

    .line 1306
    :cond_1
    sput-boolean v1, Ll/ۛۨᩴ;->᩻:Z

    return-void
.end method

.method public static ۙ(Ljava/util/ArrayList;)V
    .locals 8

    .line 1240
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1241
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۨᩴ;

    .line 1242
    invoke-static {v1, v0}, Ll/ۛۨᩴ;->ۙ(Ll/᩷ۨᩴ;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 1245
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v1, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۨᩴ;

    .line 1246
    iget-wide v3, v3, Ll/᩺ۨᩴ;->᩶:J

    add-long/2addr v1, v3

    goto :goto_1

    :cond_1
    const/high16 p0, 0xc800000

    int-to-long v3, p0

    cmp-long p0, v1, v3

    if-gtz p0, :cond_2

    goto :goto_3

    .line 1252
    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1253
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 v5, 0x0

    :goto_2
    if-ge v5, p0, :cond_4

    .line 1254
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺ۨᩴ;

    .line 1255
    iget-object v7, v6, Ll/᩺ۨᩴ;->ܰ:Ll/᩷ۨᩴ;

    invoke-virtual {v7}, Ll/᩷ۨᩴ;->ᩳ()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 1256
    iget-object v7, v6, Ll/᩺ۨᩴ;->ܰ:Ll/᩷ۨᩴ;

    invoke-virtual {v7}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    .line 1257
    iget-wide v6, v6, Ll/᩺ۨᩴ;->᩶:J

    sub-long/2addr v1, v6

    cmp-long v6, v1, v3

    if-gtz v6, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    return-void
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ljava/util/ArrayList;)V
    .locals 2

    .line 1266
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 413
    invoke-virtual {p0, v0}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v0

    .line 1268
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1269
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ᩳ()Z

    return-void

    .line 1271
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۨᩴ;

    .line 1272
    invoke-static {v0, p1}, Ll/ۛۨᩴ;->ۙ(Ll/᩷ۨᩴ;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_1
    return-void

    .line 1276
    :cond_2
    new-instance v0, Ll/᩺ۨᩴ;

    invoke-direct {v0, p0}, Ll/᩺ۨᩴ;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ۙ(Z)V
    .locals 11

    .line 1177
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1179
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 413
    sget-object v3, Ll/ۛۨᩴ;->ۚ:Ll/᩷ۨᩴ;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v3

    .line 1180
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-wide/32 v6, 0x1b77400

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۨᩴ;

    .line 1181
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v8

    sub-long v8, v0, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    cmp-long v10, v8, v6

    if-lez v10, :cond_0

    .line 1182
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 1183
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    goto :goto_0

    .line 1185
    :cond_0
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-eqz p0, :cond_2

    .line 1189
    invoke-static {v2}, Ll/ۛۨᩴ;->ۙ(Ljava/util/ArrayList;)V

    .line 1192
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 1193
    sget-object v3, Ll/ۛۨᩴ;->֫:Ll/᩷ۨᩴ;

    .line 413
    invoke-virtual {v3, v4}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v3

    .line 1193
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۨᩴ;

    .line 1194
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v8

    sub-long v8, v0, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    cmp-long v10, v8, v6

    if-lez v10, :cond_3

    .line 1195
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 1196
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    goto :goto_1

    .line 1198
    :cond_3
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    if-eqz p0, :cond_5

    .line 1202
    invoke-static {v2}, Ll/ۛۨᩴ;->ۙ(Ljava/util/ArrayList;)V

    .line 1205
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 1206
    sget-object v3, Ll/ۛۨᩴ;->᩷:Ll/᩷ۨᩴ;

    .line 413
    invoke-virtual {v3, v4}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v3

    .line 1206
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۨᩴ;

    .line 1207
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v8

    sub-long v8, v0, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    cmp-long v5, v8, v6

    if-lez v5, :cond_6

    .line 1208
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 1209
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    goto :goto_2

    .line 1211
    :cond_6
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    if-eqz p0, :cond_8

    .line 1215
    invoke-static {v2}, Ll/ۛۨᩴ;->ۙ(Ljava/util/ArrayList;)V

    .line 1218
    :cond_8
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-ge p0, v2, :cond_9

    .line 1219
    sget-object p0, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    const-string v2, "Android/mt_install_tmp.apk"

    invoke-virtual {p0, v2}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    .line 1220
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 1221
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 1224
    :cond_9
    invoke-static {}, Ll/ᩴۛᩴ;->ܳ()Z

    move-result p0

    if-eqz p0, :cond_a

    .line 1225
    sget-object p0, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "auto_clean_recycle_bin"

    const-string v3, "0"

    invoke-interface {p0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1227
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_a

    const v2, 0x15180

    mul-int p0, p0, v2

    int-to-long v2, p0

    const-wide/16 v4, 0x3e8

    mul-long v2, v2, v4

    sub-long/2addr v0, v2

    .line 1231
    new-instance p0, Ll/ۨۨᩴ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, p0, v2}, Ll/ᩴۛᩴ;->ۙ(JZLl/۟֡֫;Ll/᩷ۛᩴ;)Ll/ۤۛᩴ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_a
    return-void
.end method

.method public static ۙ(Ll/᩷ۨᩴ;)Z
    .locals 1

    .line 1020
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1021
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1022
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 1024
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->֡()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ۤ()Ll/᩷ۨᩴ;
    .locals 4

    .line 1004
    sget-object v0, Ll/ۛۨᩴ;->ܳ:Ll/᩷ۨᩴ;

    const-string v1, "MT2"

    .line 1005
    sget-object v2, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    if-nez v0, :cond_0

    .line 1006
    invoke-virtual {v2, v1}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 1008
    :cond_0
    invoke-static {v0}, Ll/ۛۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1010
    invoke-virtual {v2, v1}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 1011
    invoke-static {v0}, Ll/ۛۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1012
    sput-object v0, Ll/ۛۨᩴ;->ܳ:Ll/᩷ۨᩴ;

    .line 1013
    invoke-static {}, Ll/ᩴۛᩴ;->֫()V

    :cond_1
    return-object v0
.end method

.method public static ۤ(Ljava/lang/String;)V
    .locals 0

    .line 1159
    invoke-static {p0}, Ll/ۛۨᩴ;->᩷(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    sput-object p0, Ll/ۛۨᩴ;->ܳ:Ll/᩷ۨᩴ;

    .line 1160
    invoke-static {}, Ll/ᩴۛᩴ;->֫()V

    return-void
.end method

.method public static ᩴ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1080
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v1, v0, -0x1

    .line 1081
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2f

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 1084
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ljava/lang/String;)Ll/᩷ۨᩴ;
    .locals 3

    .line 1033
    sget v0, Ll/ܰۨᩴ;->ۙ:I

    const-string v0, "/sdcard"

    .line 1034
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sget-object v1, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1037
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1038
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1039
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, "/sdcard/"

    .line 1041
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x8

    .line 1042
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 1044
    invoke-static {p0, v0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    return-object v1
.end method

.method public static ᩷()V
    .locals 3

    .line 1164
    sget-boolean v0, Ll/ۛۨᩴ;->᩻:Z

    const/4 v1, 0x0

    .line 1165
    sput-boolean v1, Ll/ۛۨᩴ;->᩻:Z

    .line 1169
    sget-object v1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/᩵ۨᩴ;

    invoke-direct {v2, v0}, Ll/᩵ۨᩴ;-><init>(Z)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ᩸(Ljava/lang/String;)Z
    .locals 1

    .line 1149
    invoke-static {p0}, Ll/ۛۨᩴ;->᩷(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    .line 1150
    invoke-static {p0}, Ll/ۛۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1151
    sput-object p0, Ll/ۛۨᩴ;->ܳ:Ll/᩷ۨᩴ;

    .line 1152
    invoke-static {}, Ll/ᩴۛᩴ;->֫()V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
