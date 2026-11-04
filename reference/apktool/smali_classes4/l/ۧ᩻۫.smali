.class public final Ll/ۧ᩻۫;
.super Ll/۟ۘܳ;
.source "8AHU"


# static fields
.field public static final ᩶:Ll/ۧ᩻۫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Ll/ۧ᩻۫;

    .line 36
    invoke-direct {v0}, Ll/۟ۘܳ;-><init>()V

    .line 34
    sput-object v0, Ll/ۧ᩻۫;->᩶:Ll/ۧ᩻۫;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ܽ֡֫;Ll/ۖۗܳ;)Ljava/io/InputStream;
    .locals 0

    .line 56
    invoke-interface {p2}, Ll/ۖۗܳ;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 59
    :cond_0
    invoke-interface {p2}, Ll/ۖۗܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 17

    .line 88
    invoke-static {}, Ll/ܺ֫ܺ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 91
    :cond_0
    invoke-static/range {p1 .. p1}, Ll/ۜ᩵ܳ;->۫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    .line 92
    invoke-static {v0, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v2

    .line 93
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_a

    const-string v2, "/"

    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v6, "/system"

    const-string v7, "/system_ext"

    const-string v8, "/etc"

    const-string v9, "/sdcard"

    const-string v10, "/storage"

    const-string v11, "/data"

    const-string v12, "/cust"

    const-string v13, "/mnt"

    const-string v14, "/proc"

    const-string v15, "/product"

    const-string v16, "/vendor"

    .line 97
    filled-new-array/range {v6 .. v16}, [Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0xb

    if-ge v4, v5, :cond_b

    .line 99
    aget-object v5, v2, v4

    new-array v6, v1, [Ljava/lang/String;

    .line 100
    invoke-static {v5, v6}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v5

    .line 101
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->֨()Z

    move-result v6

    if-eqz v6, :cond_1

    new-instance v6, Ll/ۚ᩻۫;

    invoke-direct {v6, v5}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 103
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->getParent()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 104
    new-instance v1, Ll/ۚ᩻۫;

    invoke-direct {v1, v4}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v1, "999"

    goto :goto_1

    :cond_3
    const-string v2, "999"

    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "0"

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_b

    .line 114
    invoke-virtual {v4, v1}, Ll/᩷ۨᩴ;->ᩴ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 115
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 116
    new-instance v2, Ll/ۚ᩻۫;

    invoke-direct {v2, v1}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_5
    const-string v2, "/storage/"

    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "/storage/emulated"

    new-array v1, v1, [Ljava/lang/String;

    .line 120
    invoke-static {v2, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v2, Ll/ۚ᩻۫;

    invoke-direct {v2, v1}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_6
    const-string v2, "/data/"

    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v2, "/data/app"

    new-array v4, v1, [Ljava/lang/String;

    .line 123
    invoke-static {v2, v4}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v2

    .line 124
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->֨()Z

    move-result v4

    if-eqz v4, :cond_7

    new-instance v4, Ll/ۚ᩻۫;

    invoke-direct {v4, v2}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    :cond_7
    invoke-static {}, Ll/ۘ۟ᩴ;->᩸()Ll/᩹۟ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩹۟ᩴ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_b

    const-string v2, "/data/local"

    new-array v1, v1, [Ljava/lang/String;

    .line 126
    invoke-static {v2, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 127
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v2, Ll/ۚ᩻۫;

    invoke-direct {v2, v1}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_8
    const-string v2, "/data/local/"

    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 130
    invoke-static {}, Ll/ۘ۟ᩴ;->᩸()Ll/᩹۟ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩹۟ᩴ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_b

    const-string v2, "/data/local/tmp"

    new-array v1, v1, [Ljava/lang/String;

    .line 131
    invoke-static {v2, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 132
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v2, Ll/ۚ᩻۫;

    invoke-direct {v2, v1}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    const-string v2, "/data/app/"

    .line 134
    sget v4, Ll/᩺ۨۨ;->ۙ:I

    .line 7772
    sget-object v4, Ll/᩶ۨۨ;->᩷:Ll/᩶ۨۨ;

    invoke-virtual {v4, v2, v0}, Ll/᩶ۨۨ;->᩷(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 135
    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 137
    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/۟᩵ܳ;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, Ll/۟᩵ܳ;-><init>(I)V

    .line 138
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/֫᩻۫;

    invoke-direct {v2, v0}, Ll/֫᩻۫;-><init>(Ljava/lang/String;)V

    .line 139
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ܳۚ᩵;

    invoke-direct {v2, v5, v0}, Ll/ܳۚ᩵;-><init>(ILjava/lang/Object;)V

    .line 140
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    .line 148
    invoke-interface {v1}, Ll/᩵ܺۗ;->distinct()Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/᩻֡ۗ;

    invoke-direct {v2, v5, v0}, Ll/᩻֡ۗ;-><init>(ILjava/lang/Object;)V

    .line 149
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/᩻֫᩺;

    invoke-direct {v2, v4}, Ll/᩻֫᩺;-><init>(I)V

    .line 150
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ܽ֡ۗ;

    invoke-direct {v2, v4}, Ll/ܽ֡ۗ;-><init>(I)V

    .line 151
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    .line 152
    new-instance v2, Ll/ܶ֡ۗ;

    invoke-direct {v2, v5, v3}, Ll/ܶ֡ۗ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->forEach(Ljava/util/function/Consumer;)V

    goto :goto_3

    .line 155
    :cond_a
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۨᩴ;

    .line 156
    new-instance v4, Ll/ۚ᩻۫;

    invoke-direct {v4, v2}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_b
    :goto_3
    const-string v1, "/storage/"

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 160
    const-class v0, Ll/ܺ᩶ᩴ;

    move-object/from16 v16, v0

    monitor-enter v16

    .line 161
    :try_start_0
    invoke-static {}, Ll/ܺ᩶ᩴ;->ۤ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻᩶ᩴ;

    .line 162
    new-instance v2, Ll/ۚ᩻۫;

    invoke-direct {v2, v1}, Ll/ۚ᩻۫;-><init>(Ll/᩻᩶ᩴ;)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 164
    :cond_c
    monitor-exit v16

    return-object v3

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_d
    return-object v3
.end method

.method public final ۙ(Ljava/lang/String;)Ll/ۖۗܳ;
    .locals 3

    const-string v0, "/"

    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v1, p1}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 69
    :cond_0
    new-instance v2, Ll/ۚ᩻۫;

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {p1, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    invoke-direct {v2, p1}, Ll/ۚ᩻۫;-><init>(Ll/᩷ۨᩴ;)V

    .line 70
    invoke-virtual {v2}, Ll/۫᩶ܳ;->isDirectory()Z

    move-result p1

    if-eq p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final ۙ(Ljava/security/MessageDigest;)V
    .locals 1

    const-string v0, "local"

    .line 78
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final ۙ(Ll/ۛۚۤ;)V
    .locals 0

    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    return-void
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "local"

    return-object v0
.end method
