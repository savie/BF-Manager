.class public final Ll/ܰۨᩴ;
.super Ljava/lang/Object;
.source "D18B"


# static fields
.field public static final synthetic ۙ:I

.field public static ۚ:Ljava/lang/Boolean;

.field public static final ۤ:Ll/ܿۗ;

.field public static ۫:I

.field public static ܳ:Ll/᩵ܿᩴ;

.field public static ᩴ:Z

.field public static final ᩷:Ljava/lang/String;

.field public static ᩸:Ljava/lang/Boolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 59
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܰۨᩴ;->᩷:Ljava/lang/String;

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xffffff

    and-long/2addr v1, v3

    long-to-int v2, v1

    sput v2, Ll/ܰۨᩴ;->۫:I

    .line 61
    new-instance v1, Ll/ܿۗ;

    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, v2}, Ll/ܿۗ;-><init>(I)V

    .line 61
    sput-object v1, Ll/ܰۨᩴ;->ۤ:Ll/ܿۗ;

    const/4 v2, 0x1

    .line 62
    sput-boolean v2, Ll/ܰۨᩴ;->ᩴ:Z

    .line 63
    new-instance v2, Ll/ܶۨᩴ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sput-object v2, Ll/ܰۨᩴ;->ܳ:Ll/᩵ܿᩴ;

    .line 69
    invoke-virtual {v1, v0}, Ll/ܿۗ;->add(Ljava/lang/Object;)Z

    const-string v0, "/sdcard"

    .line 70
    invoke-virtual {v1, v0}, Ll/ܿۗ;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ۙ()Ljava/lang/String;
    .locals 1

    .line 78
    sget-object v0, Ll/ܰۨᩴ;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 641
    invoke-static {}, Ll/ܰۨᩴ;->᩷()Ll/ܿۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿۗ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    move-object v1, v0

    check-cast v1, Ll/۟ۗ;

    invoke-virtual {v1}, Ll/۟ۗ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ll/۟ۗ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 642
    invoke-static {p0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "/"

    .line 643
    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 644
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v0, :cond_2

    .line 645
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 11

    const/4 v0, 0x0

    .line 310
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const-string v2, "Unsafe archive entry path: "

    if-gez v1, :cond_d

    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "\\"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 313
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x3a

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-lt v3, v5, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 314
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 317
    :cond_1
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 319
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v9

    if-gt v7, v9, :cond_9

    .line 320
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v9

    if-eq v7, v9, :cond_2

    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x2f

    if-eq v9, v10, :cond_2

    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x5c

    if-eq v9, v10, :cond_2

    goto :goto_4

    .line 323
    :cond_2
    invoke-virtual {p0, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v9, v7, 0x1

    .line 325
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_8

    const-string v10, "."

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_3

    :cond_3
    const-string v10, ".."

    .line 328
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 329
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_4

    .line 0
    invoke-static {v3, v6}, Ll/ۖܶ᩸;->ۙ(Ljava/util/ArrayList;I)V

    goto :goto_3

    .line 330
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 335
    :cond_5
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    if-lt v10, v5, :cond_7

    invoke-virtual {v8, v0}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-static {v10}, Ljava/lang/Character;->isLetter(C)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v10, v4, :cond_6

    goto :goto_2

    .line 336
    :cond_6
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 338
    :cond_7
    :goto_2
    invoke-static {v8}, Ll/ܰۨᩴ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_3
    move v8, v9

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 0
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_c

    .line 341
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_6

    .line 342
    :cond_b
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_6
    return-object v0

    .line 311
    :cond_d
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ll/᩷ۨᩴ;)Ljava/lang/String;
    .locals 7

    .line 877
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 878
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 879
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v2, "\\"

    .line 881
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const v3, 0x7f1203b0

    if-nez v2, :cond_b

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_2

    .line 883
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const v4, 0x7f120a40

    const v5, 0x7f120a80

    const v6, 0x7f120a81

    if-eqz v2, :cond_7

    .line 884
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 885
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۧۙ()Ll/᩷ۨᩴ;

    move-result-object v2

    .line 417
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ۜۙ()Ljava/util/List;

    move-result-object v2

    .line 886
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 888
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 889
    invoke-static {v6}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 891
    :cond_2
    invoke-static {v5}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v0, ".tmp"

    .line 899
    invoke-virtual {p0, v0}, Ll/᩷ۨᩴ;->ܳ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 897
    invoke-virtual {p0, v0}, Ll/᩷ۨᩴ;->᩷(Ll/᩷ۨᩴ;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0, p1}, Ll/᩷ۨᩴ;->᩷(Ll/᩷ۨᩴ;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    const-string p0, ":"

    .line 899
    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "?"

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "*"

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "\""

    .line 900
    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "<"

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, ">"

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "|"

    .line 901
    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_0

    .line 904
    :cond_5
    invoke-static {v4}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 902
    :cond_6
    :goto_0
    invoke-static {v3}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 906
    :cond_7
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 907
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result p0

    if-eqz p0, :cond_8

    .line 908
    invoke-static {v6}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 910
    :cond_8
    invoke-static {v5}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 912
    :cond_9
    invoke-virtual {p0, p1}, Ll/᩷ۨᩴ;->᩷(Ll/᩷ۨᩴ;)Z

    move-result p0

    if-eqz p0, :cond_a

    :goto_1
    const/4 p0, 0x0

    return-object p0

    .line 915
    :cond_a
    invoke-static {v4}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 882
    :cond_b
    :goto_2
    invoke-static {v3}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Landroid/net/Uri;)Ll/ۘۨᩴ;
    .locals 6

    const-string v0, "file"

    .line 205
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 206
    new-instance v0, Ll/ۘۨᩴ;

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ll/ܰ᩵ᩴ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {p0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    invoke-direct {v0, p0, v2}, Ll/ۘۨᩴ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v0, "content"

    .line 207
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 208
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 209
    sget-object v3, Ll/ܽۨᩴ;->ܰ:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 210
    new-instance v0, Ll/ۘۨᩴ;

    invoke-static {p0}, Ll/ܽۨᩴ;->ۙ(Landroid/net/Uri;)Ll/᩷ۨᩴ;

    move-result-object p0

    invoke-direct {v0, p0, v2}, Ll/ۘۨᩴ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-object v0

    :cond_1
    const-string v3, "bin.mt.plus.fileprovider2"

    .line 211
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "bin.mt.plus.canary.fileprovider2"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "bin.mt.plus.fp"

    .line 212
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "bin.mt.plus.canary.fp"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string v0, "com.android.externalstorage.documents"

    .line 217
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 218
    invoke-static {p0}, Ll/᩸᩶ᩴ;->ᩴ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v1, "primary"

    .line 220
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x3

    if-eqz v1, :cond_3

    .line 221
    invoke-static {p0}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 223
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 224
    new-instance v0, Ll/ۘۨᩴ;

    sget-object v1, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v1, p0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    invoke-direct {v0, p0, v2}, Ll/ۘۨᩴ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-object v0

    .line 48
    :cond_3
    invoke-static {v2}, Ll/ܽܿᩴ;->᩷(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 226
    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺܿᩴ;

    .line 227
    iget-object v5, v4, Ll/ܺܿᩴ;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 228
    invoke-static {p0}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 230
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 231
    new-instance v0, Ll/ۘۨᩴ;

    iget-object v1, v4, Ll/ܺܿᩴ;->ۤ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    invoke-direct {v0, p0, v2}, Ll/ۘۨᩴ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-object v0

    :cond_5
    const-string v0, "com.android.providers.downloads.ui.fileprovider"

    .line 236
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 237
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v1, "/external_files/Download/"

    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 239
    new-instance p0, Ll/ۘۨᩴ;

    sget-object v1, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Ll/ۘۨᩴ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-object p0

    .line 213
    :cond_6
    :goto_0
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v3, "/NOT_DELETE/"

    .line 214
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 215
    new-instance p0, Ll/ۘۨᩴ;

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Ll/ۘۨᩴ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-object p0

    .line 242
    :cond_7
    new-instance v0, Ll/ۘۨᩴ;

    new-instance v1, Ll/᩸ܿᩴ;

    invoke-direct {v1, p0}, Ll/᩸ܿᩴ;-><init>(Landroid/net/Uri;)V

    invoke-static {p0}, Ll/ܰ᩵ᩴ;->ۙ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ۘۨᩴ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-object v0

    .line 244
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported uri: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Landroid/content/Intent;)Ll/᩷ۨᩴ;
    .locals 3

    .line 157
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 186
    invoke-static {v0}, Ll/ܰۨᩴ;->ۙ(Landroid/net/Uri;)Ll/ۘۨᩴ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۘۨᩴ;->᩷()Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    .line 159
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Intent data is null: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ljava/io/File;)Ll/᩷ۨᩴ;
    .locals 15

    .line 500
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 501
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    const/4 v3, 0x1

    if-lt v1, v2, :cond_d

    const/4 v1, 0x4

    .line 685
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 676
    invoke-static {}, Ll/ܰۨᩴ;->᩷()Ll/ܿۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܿۗ;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    move-object v5, v4

    check-cast v5, Ll/۟ۗ;

    invoke-virtual {v5}, Ll/۟ۗ;->hasNext()Z

    move-result v6

    const-string v7, ""

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x0

    if-eqz v6, :cond_9

    invoke-virtual {v5}, Ll/۟ۗ;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 677
    invoke-static {v0, v5}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 678
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v6, v4, 0x1

    .line 713
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x7

    const-string v13, "android"

    invoke-static {v0, v6, v13, v11, v12}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v11

    if-eqz v11, :cond_6

    add-int/lit8 v11, v4, 0x9

    const-string v12, "data"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v13

    invoke-static {v0, v11, v12, v13, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v12

    const-string v13, "/"

    if-eqz v12, :cond_3

    add-int/lit8 v4, v4, 0xe

    .line 684
    invoke-static {}, Ll/᩶᩷ۧ;->᩹()Ljava/lang/String;

    move-result-object v5

    .line 713
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v12

    invoke-static {v0, v4, v5, v11, v12}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 685
    invoke-static {v2, v10}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto/16 :goto_3

    .line 687
    :cond_1
    invoke-virtual {v0, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    .line 688
    :goto_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto :goto_3

    :cond_3
    const-string v12, "obb"

    .line 713
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v14

    invoke-static {v0, v11, v12, v14, v8}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v11

    if-eqz v11, :cond_6

    add-int/lit8 v4, v4, 0xd

    .line 691
    invoke-static {}, Ll/᩶᩷ۧ;->᩹()Ljava/lang/String;

    move-result-object v5

    .line 713
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v12

    invoke-static {v0, v4, v5, v11, v12}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 692
    invoke-static {v2, v10}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto :goto_3

    .line 694
    :cond_4
    invoke-virtual {v0, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v3

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    .line 695
    :goto_1
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto :goto_3

    .line 698
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v2, v4, :cond_7

    invoke-static {v0}, Lbin/mt/plus/Features3;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_7
    move-object v2, v10

    .line 699
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-nez v2, :cond_8

    move-object v2, v7

    :cond_8
    invoke-static {v4, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    .line 702
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2, v10}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    .line 503
    :goto_3
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v3, :cond_c

    if-eq v4, v9, :cond_b

    if-eq v4, v8, :cond_b

    if-eq v4, v1, :cond_a

    goto :goto_4

    .line 513
    :cond_a
    new-instance v0, Ll/֨ۨᩴ;

    invoke-direct {v0, p0, v3}, Ll/֨ۨᩴ;-><init>(Ljava/io/File;Z)V

    .line 514
    iput-object v7, v0, Ll/֨ۨᩴ;->ۢ:Ljava/lang/String;

    return-object v0

    .line 511
    :cond_b
    iget-object v0, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 544
    invoke-static {p0, v0, v10}, Ll/ܰۨᩴ;->ۙ(Ljava/io/File;Ljava/lang/String;Ll/ܰܰᩴ;)Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    .line 505
    :cond_c
    new-instance v0, Ll/֨ۨᩴ;

    const/4 v1, 0x0

    .line 49
    invoke-direct {v0, p0, v1}, Ll/֨ۨᩴ;-><init>(Ljava/io/File;Z)V

    .line 506
    iget-object p0, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    iput-object p0, v0, Ll/֨ۨᩴ;->ۢ:Ljava/lang/String;

    return-object v0

    :cond_d
    const/4 v1, 0x0

    .line 518
    invoke-static {v0}, Ll/ܰۨᩴ;->᩸(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 519
    new-instance v0, Ll/֨ۨᩴ;

    .line 49
    invoke-direct {v0, p0, v1}, Ll/֨ۨᩴ;-><init>(Ljava/io/File;Z)V

    return-object v0

    .line 521
    :cond_e
    :goto_4
    invoke-static {v0}, Ll/ܰۨᩴ;->ۤ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 523
    new-instance v0, Ll/ۜܿᩴ;

    invoke-direct {v0, p0, v3}, Ll/ۜܿᩴ;-><init>(Ljava/io/File;Z)V

    return-object v0

    .line 525
    :cond_f
    invoke-static {p0}, Ll/ۚ᩶ᩴ;->ۙ(Ljava/io/File;)Ll/᩷ۨᩴ;

    move-result-object v0

    if-eqz v0, :cond_10

    return-object v0

    .line 529
    :cond_10
    invoke-static {p0}, Ll/ܺ᩶ᩴ;->ۙ(Ljava/io/File;)Ll/֫᩶ᩴ;

    move-result-object v0

    if-eqz v0, :cond_11

    return-object v0

    .line 533
    :cond_11
    new-instance v0, Ll/ۜܿᩴ;

    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, v1}, Ll/ۜܿᩴ;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public static ۙ(Ljava/io/File;Ljava/lang/String;Ll/ܰܰᩴ;)Ll/᩷ۨᩴ;
    .locals 10

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "Android/data"

    move-object v0, p1

    .line 554
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Android/data"

    const/16 v1, 0xe

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    const/16 v7, 0xb

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "Android/obb"

    move-object v2, p1

    .line 557
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "Android/obb"

    const/16 v1, 0xd

    .line 563
    :goto_0
    invoke-static {}, Ll/ۘ۟ᩴ;->᩸()Ll/᩹۟ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩹۟ᩴ;->ۙ()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x7

    const-string v5, "\u200bAndroid"

    if-nez v2, :cond_2

    .line 564
    invoke-static {}, Ll/ܰۨᩴ;->ۤ()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Ll/ܰۨᩴ;->᩸()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 565
    :cond_1
    new-instance p0, Ll/ܺ᩵ᩴ;

    new-instance p2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v4, p1, v0}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 565
    sget-object v0, Ll/ܰۨᩴ;->᩷:Ljava/lang/String;

    invoke-direct {p2, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0, p2, v3}, Ll/֨ۨᩴ;-><init>(Ljava/io/File;Z)V

    return-object p0

    .line 569
    :cond_2
    invoke-static {}, Ll/ܰۨᩴ;->᩸()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 570
    new-instance v0, Ll/ܿܰᩴ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v4, p1, v1}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 570
    invoke-direct {v0, p0, p1, v5, p2}, Ll/ܿܰᩴ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ܰܰᩴ;)V

    return-object v0

    .line 572
    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v2, v4, :cond_5

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v9, v2, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v0, 0x2f

    .line 573
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 575
    new-instance v0, Ll/ܿܰᩴ;

    invoke-direct {v0, p0, p1, p1, p2}, Ll/ܿܰᩴ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ܰܰᩴ;)V

    return-object v0

    .line 577
    :cond_4
    new-instance v1, Ll/ܿܰᩴ;

    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p0, p1, v0, p2}, Ll/ܿܰᩴ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ܰܰᩴ;)V

    return-object v1

    .line 579
    :cond_5
    new-instance v1, Ll/ܿܰᩴ;

    invoke-direct {v1, p0, p1, v0, p2}, Ll/ܿܰᩴ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ܰܰᩴ;)V

    return-object v1

    .line 561
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Path must be in Android/data or Android/obb: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;
    .locals 4

    const-string v0, "content://"

    .line 470
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "android.resource://"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "$RECYCLE.BIN$/"

    .line 477
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 478
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ll/ᩴۛᩴ;->ᩴ()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xd

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 480
    invoke-static {}, Ll/ۘ۟ᩴ;->᩸()Ll/᩹۟ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩹۟ᩴ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 481
    invoke-static {p0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 483
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "/data/media/"

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 487
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 488
    array-length p0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_2

    aget-object v2, p1, v1

    .line 489
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    move-object v0, v3

    goto :goto_0

    .line 491
    :cond_2
    invoke-static {v0}, Ll/ܰۨᩴ;->ۙ(Ljava/io/File;)Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    .line 471
    :cond_3
    :goto_1
    array-length p1, p1

    if-nez p1, :cond_4

    .line 474
    new-instance p1, Ll/᩸ܿᩴ;

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/᩸ܿᩴ;-><init>(Landroid/net/Uri;)V

    return-object p1

    .line 472
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Children must be empty when path is context uri"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;)Ll/᩷ۨᩴ;
    .locals 3

    .line 775
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->֡()Z

    .line 778
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Ll/ܰۨᩴ;->۫:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Ll/ܰۨᩴ;->۫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 779
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->֨()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0
.end method

.method public static ۙ(Ll/᩵ܿᩴ;)V
    .locals 0

    .line 784
    sput-object p0, Ll/ܰۨᩴ;->ܳ:Ll/᩵ܿᩴ;

    return-void
.end method

.method public static ۙ(Ll/᩷ۨᩴ;)V
    .locals 2

    .line 803
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->۟ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۧ()Ll/ۜܿᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜܿᩴ;->ۙۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 806
    :cond_0
    sget-object v0, Ll/ܰۨᩴ;->ܳ:Ll/᩵ܿᩴ;

    invoke-interface {v0}, Ll/᩵ܿᩴ;->get()Ll/ۨܿᩴ;

    move-result-object v0

    .line 807
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    if-eqz v0, :cond_1

    .line 808
    invoke-interface {v0, p0}, Ll/ۨܿᩴ;->ۙ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 809
    invoke-interface {v0, p0}, Ll/ۨܿᩴ;->᩷(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۙ(Ljava/lang/String;ILjava/lang/String;II)Z
    .locals 9

    if-ltz p1, :cond_7

    if-lt p3, p1, :cond_7

    .line 718
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le p3, v0, :cond_0

    goto :goto_1

    :cond_0
    if-ltz p4, :cond_7

    .line 721
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-le p4, v0, :cond_1

    goto :goto_1

    :cond_1
    sub-int v0, p3, p1

    const/16 v1, 0x2f

    const/4 v2, 0x1

    if-le v0, v2, :cond_2

    sub-int/2addr p3, v2

    .line 726
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    move-result p3

    if-ne p3, v1, :cond_2

    add-int/lit8 v0, v0, -0x1

    :cond_2
    if-le p4, v2, :cond_3

    add-int/lit8 p3, p4, -0x1

    .line 730
    invoke-virtual {p2, p3}, Ljava/lang/String;->charAt(I)C

    move-result p3

    if-ne p3, v1, :cond_3

    add-int/lit8 p4, p4, -0x1

    :cond_3
    if-le p4, v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    const/4 p3, 0x0

    move-object v3, p0

    move v5, p1

    move-object v6, p2

    move v7, p3

    move v8, p4

    .line 736
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v3

    if-eqz v3, :cond_7

    if-eq v0, p4, :cond_6

    if-ne p4, v2, :cond_5

    .line 737
    invoke-virtual {p2, p3}, Ljava/lang/String;->charAt(I)C

    move-result p2

    if-ne p2, v1, :cond_5

    goto :goto_0

    :cond_5
    add-int/2addr p1, p4

    .line 740
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    if-ne p0, v1, :cond_7

    :cond_6
    :goto_0
    return v2

    :cond_7
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 709
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {p0, v2, p1, v0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result p0

    return p0
.end method

.method public static ۙ(Ll/ܽ֡֫;)Z
    .locals 1

    .line 145
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    .line 146
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ljava/util/List;)Z
    .locals 8

    .line 924
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/ۗۨᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۗۨᩴ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    invoke-static {}, Ll/֫ܺۗ;->toUnmodifiableSet()Ll/ۚܺۗ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    .line 931
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܿۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 934
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 936
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_4

    .line 937
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x61

    if-lt v6, v7, :cond_2

    const/16 v7, 0x7a

    if-gt v6, v7, :cond_2

    .line 939
    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/16 v7, 0x41

    if-lt v6, v7, :cond_3

    const/16 v7, 0x5a

    if-gt v6, v7, :cond_3

    .line 942
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_1

    .line 946
    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 947
    invoke-virtual {p0, v2}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    .line 954
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->֨()Z

    move-result p0

    xor-int/2addr p0, v3

    return p0

    :cond_5
    return v3
.end method

.method public static ۙ([Ljava/lang/String;)[Ll/᩷ۨᩴ;
    .locals 5

    .line 297
    array-length v0, p0

    new-array v0, v0, [Ll/᩷ۨᩴ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 298
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    .line 299
    aget-object v3, p0, v2

    new-array v4, v1, [Ljava/lang/String;

    invoke-static {v3, v4}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۤ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    .line 354
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v1, "Unsafe archive symbolic link target: "

    if-nez v0, :cond_12

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-gez v2, :cond_12

    const-string v2, "/"

    .line 355
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_12

    const-string v3, "\\"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_12

    .line 358
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x3a

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-lt v3, v5, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 359
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 362
    :cond_1
    :goto_0
    invoke-static {p0, v0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    .line 363
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/16 v7, 0x2f

    .line 364
    invoke-virtual {p0, v7}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_4

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v9, v8, :cond_3

    .line 368
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v7, :cond_2

    .line 369
    invoke-virtual {p0, v10, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v9, 0x1

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 373
    :cond_3
    invoke-virtual {p0, v10, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 378
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v10

    const-string v11, ".."

    const-string v12, "."

    if-gt v8, v10, :cond_c

    .line 379
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v10

    if-eq v8, v10, :cond_5

    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v10, v7, :cond_5

    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v13, 0x5c

    if-eq v10, v13, :cond_5

    goto :goto_5

    .line 382
    :cond_5
    invoke-virtual {p1, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v10, v8, 0x1

    .line 384
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_b

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    goto :goto_4

    .line 387
    :cond_6
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 388
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_7

    .line 0
    invoke-static {p0, v6}, Ll/ۖܶ᩸;->ۙ(Ljava/util/ArrayList;I)V

    goto :goto_4

    .line 389
    :cond_7
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 394
    :cond_8
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    if-lt v11, v5, :cond_a

    invoke-virtual {v9, v0}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-static {v11}, Ljava/lang/Character;->isLetter(C)Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-virtual {v9, v6}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-eq v11, v4, :cond_9

    goto :goto_3

    .line 395
    :cond_9
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 397
    :cond_a
    :goto_3
    invoke-static {v9}, Ll/ܰۨᩴ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_4
    move v9, v10

    :goto_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 401
    :cond_c
    :goto_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_d

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_d

    .line 402
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 405
    :cond_d
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    move v1, v0

    .line 406
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_e

    .line 407
    invoke-virtual {p1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 409
    :cond_e
    :goto_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_f

    .line 410
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 412
    :cond_f
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_10

    return-object v12

    .line 0
    :cond_10
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_9

    :cond_11
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 356
    :cond_12
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۤ(Ll/᩷ۨᩴ;)V
    .locals 1

    .line 796
    sget-object v0, Ll/ܰۨᩴ;->ܳ:Ll/᩵ܿᩴ;

    invoke-interface {v0}, Ll/᩵ܿᩴ;->get()Ll/ۨܿᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 798
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ll/ۨܿᩴ;->᩷(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ۤ()Z
    .locals 7

    .line 814
    sget-object v0, Ll/ܰۨᩴ;->᩸:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 816
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 818
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "Android"

    sget-object v2, Ll/ܰۨᩴ;->᩷:Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 819
    new-instance v1, Ljava/io/File;

    const-string v3, "\u200bAndroid"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 820
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 821
    new-instance v0, Ljava/io/File;

    const-string v3, "\u200bAndroid/data"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 822
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 825
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v5, v0, v3

    .line 826
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 863
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    sget v6, Landroid/system/OsConstants;->X_OK:I

    invoke-static {v5, v6}, Landroid/system/Os;->access(Ljava/lang/String;I)Z
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v4, v4, 0x1

    const/16 v5, 0x14

    if-ne v4, v5, :cond_1

    goto :goto_1

    .line 828
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Ll/ܰۨᩴ;->᩸:Ljava/lang/Boolean;

    .line 829
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Ll/ܰۨᩴ;->ۚ:Ljava/lang/Boolean;

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 838
    :cond_2
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Ll/ܰۨᩴ;->᩸:Ljava/lang/Boolean;

    .line 839
    sput-object v0, Ll/ܰۨᩴ;->ۚ:Ljava/lang/Boolean;

    const/4 v0, 0x1

    return v0

    .line 843
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Ll/ܰۨᩴ;->᩸:Ljava/lang/Boolean;

    .line 844
    sput-object v0, Ll/ܰۨᩴ;->ۚ:Ljava/lang/Boolean;

    return v1
.end method

.method public static ۤ(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "/"

    .line 748
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 749
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ll/᩶᩷ۧ;->۫()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v2, "/data/"

    .line 752
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_2

    .line 755
    :cond_2
    invoke-static {}, Ll/᩶᩷ۧ;->᩹()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 756
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/data/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    .line 759
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/user/0/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    .line 762
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/user_de/0/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    .line 765
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/user/999/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_1

    .line 768
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/user_de/999/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_7

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_7
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ܳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 422
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_5

    .line 423
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x3e

    if-eq v4, v5, :cond_1

    const/16 v5, 0x3f

    if-eq v4, v5, :cond_1

    const/16 v5, 0x2028

    const/16 v6, 0x20

    if-eq v4, v5, :cond_2

    const/16 v5, 0x2029

    if-eq v4, v5, :cond_2

    packed-switch v4, :pswitch_data_0

    sparse-switch v4, :sswitch_data_0

    const/16 v5, 0x2000

    if-lt v4, v5, :cond_0

    const/16 v5, 0x200a

    if-gt v4, v5, :cond_0

    goto :goto_1

    :cond_0
    move v6, v4

    goto :goto_1

    :cond_1
    :sswitch_0
    const/16 v6, 0x5f

    :cond_2
    :goto_1
    :pswitch_0
    :sswitch_1
    if-eq v6, v4, :cond_3

    if-nez v1, :cond_3

    .line 459
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 460
    invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_3
    if-eqz v1, :cond_4

    .line 463
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-nez v1, :cond_6

    return-object p0

    .line 466
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_1
        0x22 -> :sswitch_0
        0x2a -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x5c -> :sswitch_0
        0x7c -> :sswitch_0
        0x85 -> :sswitch_1
        0xa0 -> :sswitch_1
        0x1680 -> :sswitch_1
        0x202f -> :sswitch_1
        0x205f -> :sswitch_1
        0x3000 -> :sswitch_1
    .end sparse-switch
.end method

.method public static ᩴ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 659
    invoke-static {p0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 660
    sget-object v1, Ll/ܰۨᩴ;->᩷:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 661
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 663
    :cond_0
    invoke-static {p0}, Ll/ܰۨᩴ;->᩸(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    return-object p0
.end method

.method public static ᩷(Landroid/content/Intent;)Ll/ۘۨᩴ;
    .locals 3

    .line 174
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "android.intent.extra.STREAM"

    .line 176
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    :cond_0
    if-eqz v0, :cond_1

    .line 181
    invoke-static {v0}, Ll/ܰۨᩴ;->ۙ(Landroid/net/Uri;)Ll/ۘۨᩴ;

    move-result-object p0

    return-object p0

    .line 179
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Intent data is null: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ᩷()Ll/ܿۗ;
    .locals 5

    .line 116
    sget-boolean v0, Ll/ܰۨᩴ;->ᩴ:Z

    sget-object v1, Ll/ܰۨᩴ;->ۤ:Ll/ܿۗ;

    if-eqz v0, :cond_3

    .line 117
    invoke-static {}, Ll/ۘ۟ᩴ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ll/۟۟ᩴ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 119
    sput-boolean v0, Ll/ܰۨᩴ;->ᩴ:Z

    .line 120
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 123
    :try_start_0
    invoke-static {v0}, Ll/۟۟ᩴ;->ۙ(Z)Ll/ܶ۟ᩴ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 124
    :cond_1
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 125
    new-instance v3, Ljava/io/File;

    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ܶ۟ᩴ;->ۚ(Ljava/lang/String;)Ll/᩷֡ᩴ;

    move-result-object v3

    .line 126
    invoke-virtual {v3}, Ll/᩷֡ᩴ;->᩷()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 127
    invoke-virtual {v3}, Ll/᩷֡ᩴ;->᩷()Ljava/lang/String;

    move-result-object v3

    .line 128
    invoke-virtual {v1, v3}, Ll/ܿۗ;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 129
    invoke-virtual {v2, v3}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 137
    :cond_2
    invoke-virtual {v0}, Ll/ܶ۟ᩴ;->᩹()V

    return-object v1

    :catchall_0
    nop

    goto :goto_1

    :catchall_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/ܶ۟ᩴ;->᩹()V

    :cond_3
    :goto_2
    return-object v1
.end method

.method public static ᩷(Ljava/lang/String;)Z
    .locals 0

    .line 590
    invoke-static {p0}, Ll/ܽܿᩴ;->ۙ(Ljava/lang/String;)Ll/ܺܿᩴ;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩷(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 14

    .line 608
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/16 v0, 0x2f

    .line 609
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    add-int/lit8 v5, v2, 0x1

    .line 610
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    .line 611
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v5

    .line 612
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v7

    if-ne v0, v2, :cond_6

    const/4 v4, 0x1

    move-object v3, p0

    move-object v6, p1

    move v8, v0

    .line 613
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    .line 620
    :cond_1
    invoke-static {}, Ll/ܰۨᩴ;->᩷()Ll/ܿۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܿۗ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, -0x1

    :goto_0
    move-object v5, v2

    check-cast v5, Ll/۟ۗ;

    invoke-virtual {v5}, Ll/۟ۗ;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v5}, Ll/۟ۗ;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "/"

    .line 621
    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v1

    :goto_1
    if-gez v3, :cond_3

    .line 622
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v6, :cond_3

    invoke-static {p0, v5}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v10, v6

    goto :goto_2

    :cond_3
    move v10, v3

    :goto_2
    if-gez v4, :cond_4

    .line 625
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v6, :cond_4

    invoke-static {p1, v5}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v12, v6

    goto :goto_3

    :cond_4
    move v12, v4

    :goto_3
    if-ltz v10, :cond_5

    if-ltz v12, :cond_5

    .line 630
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v10

    .line 631
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v12

    if-ne v2, v3, :cond_6

    const/4 v9, 0x1

    sub-int v13, v2, v0

    move-object v8, p0

    move-object v11, p1

    .line 632
    invoke-virtual/range {v8 .. v13}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p0

    if-eqz p0, :cond_6

    :goto_4
    return v1

    :cond_5
    move v3, v10

    move v4, v12

    goto :goto_0

    :cond_6
    :goto_5
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩷(Ll/᩷ۨᩴ;)Z
    .locals 1

    .line 788
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->۟ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۧ()Ll/ۜܿᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜܿᩴ;->ۙۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 791
    :cond_0
    sget-object v0, Ll/ܰۨᩴ;->ܳ:Ll/᩵ܿᩴ;

    invoke-interface {v0}, Ll/᩵ܿᩴ;->get()Ll/ۨܿᩴ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 792
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ll/ۨܿᩴ;->ۙ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩸()Z
    .locals 1

    .line 852
    sget-object v0, Ll/ܰۨᩴ;->ۚ:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 853
    invoke-static {}, Ll/ܰۨᩴ;->ۤ()Z

    .line 855
    :cond_0
    sget-object v0, Ll/ܰۨᩴ;->ۚ:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static ᩸(Ljava/lang/String;)Z
    .locals 3

    .line 595
    invoke-static {}, Ll/ܰۨᩴ;->᩷()Ll/ܿۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿۗ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    move-object v1, v0

    check-cast v1, Ll/۟ۗ;

    invoke-virtual {v1}, Ll/۟ۗ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ll/۟ۗ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 596
    invoke-static {p0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
