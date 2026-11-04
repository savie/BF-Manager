.class public final Ll/ۛۘۗ;
.super Ljava/lang/Object;
.source "YITH"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۗۙ:Ljava/lang/String;

.field public static final ۨۙ:Ll/᩻ܽ᩺;

.field public static final ᩵ۙ:I


# instance fields
.field public ֡:Ljava/lang/String;

.field public ֨:Ll/ܶۘۗ;

.field public ֫ۙ:Z

.field public final ۖ:Ljava/util/ArrayList;

.field public ۙۙ:Z

.field public ۚۙ:Z

.field public ۜ:Z

.field public ۟:Ll/᩵ۘۗ;

.field public ۠:Ljava/util/HashSet;

.field public final ۡ:Ll/᩷֫᩵;

.field public ۢ:Z

.field public ۤۙ:Ll/ۡۘۗ;

.field public ۧۙ:Z

.field public ۫ۙ:Ljava/util/HashMap;

.field public ۬:Z

.field public ܰ:Z

.field public ܳۙ:Ll/ܳܿۗ;

.field public ܶۙ:Z

.field public ܺۙ:I

.field public ܽۙ:Ll/ۘܿۗ;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ll/ܽۘۗ;

.field public ᩴۙ:Z

.field public ᩶:Ll/᩸ܰۗ;

.field public ᩷ۙ:Ljava/util/ArrayList;

.field public ᩸ۙ:Z

.field public ᩹ۙ:Ll/ۨۘۗ;

.field public ᩻ۙ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 34
    const-class v0, Ll/ۛۘۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ۛۘۗ;->ۨۙ:Ll/᩻ܽ᩺;

    .line 36
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Ll/ۛۘۗ;->᩵ۙ:I

    .line 38
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۛۘۗ;->ۗۙ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۛۘۗ;->᩷ۙ:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Ll/᩸ܰۗ;

    invoke-direct {v0}, Ll/᩸ܰۗ;-><init>()V

    iput-object v0, p0, Ll/ۛۘۗ;->᩶:Ll/᩸ܰۗ;

    .line 49
    new-instance v0, Ll/ۘܿۗ;

    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object v0, p0, Ll/ۛۘۗ;->ܽۙ:Ll/ۘܿۗ;

    .line 51
    new-instance v0, Ll/᩵ۘۗ;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ll/᩵ۘۗ;-><init>(I)V

    iput-object v0, p0, Ll/ۛۘۗ;->۟:Ll/᩵ۘۗ;

    .line 53
    sget v0, Ll/ۛۘۗ;->᩵ۙ:I

    iput v0, p0, Ll/ۛۘۗ;->᩻ۙ:I

    const/4 v0, 0x0

    .line 55
    iput-boolean v0, p0, Ll/ۛۘۗ;->ۧۙ:Z

    .line 57
    iput-boolean v1, p0, Ll/ۛۘۗ;->ܶۙ:Z

    .line 58
    iput-boolean v1, p0, Ll/ۛۘۗ;->ۢ:Z

    .line 60
    iput-boolean v1, p0, Ll/ۛۘۗ;->ۜ:Z

    .line 61
    iput-boolean v1, p0, Ll/ۛۘۗ;->۬:Z

    .line 62
    iput-boolean v1, p0, Ll/ۛۘۗ;->ۙۙ:Z

    .line 63
    iput-boolean v1, p0, Ll/ۛۘۗ;->ܰ:Z

    .line 64
    iput-boolean v1, p0, Ll/ۛۘۗ;->ᩴۙ:Z

    .line 67
    iput-boolean v1, p0, Ll/ۛۘۗ;->ۚۙ:Z

    .line 70
    iput-boolean v1, p0, Ll/ۛۘۗ;->֫ۙ:Z

    .line 72
    sget-object v0, Ll/ܶۘۗ;->᩶:Ll/ܶۘۗ;

    iput-object v0, p0, Ll/ۛۘۗ;->֨:Ll/ܶۘۗ;

    .line 76
    sget-object v0, Ll/ۛۘۗ;->ۗۙ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۛۘۗ;->֡:Ljava/lang/String;

    const-string v0, "    "

    .line 78
    iput-object v0, p0, Ll/ۛۘۗ;->ܿ:Ljava/lang/String;

    .line 80
    sget-object v0, Ll/ܽۘۗ;->֡:Ll/ܽۘۗ;

    iput-object v0, p0, Ll/ۛۘۗ;->ᩳ:Ll/ܽۘۗ;

    .line 82
    sget-object v0, Ll/ۡۘۗ;->᩶:Ll/ۡۘۗ;

    iput-object v0, p0, Ll/ۛۘۗ;->ۤۙ:Ll/ۡۘۗ;

    const/16 v0, 0xa

    .line 88
    iput v0, p0, Ll/ۛۘۗ;->ܺۙ:I

    .line 94
    sget-object v0, Ll/ۨۘۗ;->᩶:Ll/ۨۘۗ;

    iput-object v0, p0, Ll/ۛۘۗ;->᩹ۙ:Ll/ۨۘۗ;

    .line 100
    new-instance v0, Ll/᩷֫᩵;

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object v0, p0, Ll/ۛۘۗ;->ۡ:Ll/᩷֫᩵;

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛۘۗ;->ۖ:Ljava/util/ArrayList;

    .line 113
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۛۘۗ;->۫ۙ:Ljava/util/HashMap;

    .line 115
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۛۘۗ;->۠:Ljava/util/HashSet;

    .line 117
    new-instance v0, Ll/ܳܿۗ;

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object v0, p0, Ll/ۛۘۗ;->ܳۙ:Ll/ܳܿۗ;

    .line 119
    iput-boolean v1, p0, Ll/ۛۘۗ;->᩸ۙ:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 128
    iget-object v0, p0, Ll/ۛۘۗ;->ۡ:Ll/᩷֫᩵;

    :try_start_0
    iget-object v1, p0, Ll/ۛۘۗ;->᩶:Ll/᩸ܰۗ;

    if-eqz v1, :cond_0

    .line 129
    invoke-virtual {v1}, Ll/᩸ܰۗ;->close()V

    .line 131
    :cond_0
    iget-object v1, p0, Ll/ۛۘۗ;->ܽۙ:Ll/ۘܿۗ;

    if-eqz v1, :cond_1

    .line 132
    invoke-virtual {v1}, Ll/ۘܿۗ;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    :cond_1
    invoke-virtual {v0}, Ll/᩷֫᩵;->close()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 138
    :try_start_1
    sget-object v2, Ll/ۛۘۗ;->ۨۙ:Ll/᩻ܽ᩺;

    const-string v3, "Failed to close JadxArgs"

    invoke-interface {v2, v3, v1}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    invoke-virtual {v0}, Ll/᩷֫᩵;->close()V

    return-void

    :goto_0
    invoke-virtual {v0}, Ll/᩷֫᩵;->close()V

    .line 142
    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JadxArgs{inputFiles="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۛۘۗ;->᩷ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۛۘۗ;->᩻ۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decompilationMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛۘۗ;->֨:Ll/ܶۘۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showInconsistentCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۛۘۗ;->ۧۙ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useImports="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۛۘۗ;->ܶۙ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useKotlinMethodsForVarNames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛۘۗ;->᩹ۙ:Ll/ۨۘۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", insertDebugLines=false, extractFinally="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۛۘۗ;->ۜ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", escapeUnicode=false, replaceConsts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۛۘۗ;->ۚۙ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", restoreSwitchOverString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۛۘۗ;->֫ۙ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", respectBytecodeAccModifiers=false, commentsLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛۘۗ;->ᩳ:Ll/ܽۘۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", codeCache="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛۘۗ;->᩶:Ll/᩸ܰۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", codeWriter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛۘۗ;->۟:Ll/᩵ۘۗ;

    .line 471
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ll/ۤܰۗ;

    invoke-direct {v1, p0}, Ll/ۤܰۗ;-><init>(Ll/ۛۘۗ;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pluginOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛۘۗ;->۫ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", typeUpdatesLimitCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۛۘۗ;->ܺۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Z
    .locals 1

    .line 233
    iget-boolean v0, p0, Ll/ۛۘۗ;->ܰ:Z

    return v0
.end method

.method public final ֨()Z
    .locals 1

    .line 217
    iget-boolean v0, p0, Ll/ۛۘۗ;->۬:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛۘۗ;->֨:Ll/ܶۘۗ;

    invoke-virtual {v0}, Ll/ܶۘۗ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫ۙ()V
    .locals 1

    const/4 v0, 0x1

    .line 188
    iput-boolean v0, p0, Ll/ۛۘۗ;->ۧۙ:Z

    return-void
.end method

.method public final ۗ()Ll/ۡۘۗ;
    .locals 1

    .line 353
    iget-object v0, p0, Ll/ۛۘۗ;->ۤۙ:Ll/ۡۘۗ;

    return-object v0
.end method

.method public final ۘ()Ljava/util/HashMap;
    .locals 1

    .line 397
    iget-object v0, p0, Ll/ۛۘۗ;->۫ۙ:Ljava/util/HashMap;

    return-object v0
.end method

.method public final ۙ()Ll/᩸ܰۗ;
    .locals 1

    .line 297
    iget-object v0, p0, Ll/ۛۘۗ;->᩶:Ll/᩸ܰۗ;

    return-object v0
.end method

.method public final ۙ(Ll/ܶۘۗ;)V
    .locals 0

    .line 293
    iput-object p1, p0, Ll/ۛۘۗ;->֨:Ll/ܶۘۗ;

    return-void
.end method

.method public final ۚ()Ll/ܶۘۗ;
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ۛۘۗ;->֨:Ll/ܶۘۗ;

    return-object v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 421
    iget-boolean v0, p0, Ll/ۛۘۗ;->᩸ۙ:Z

    return v0
.end method

.method public final ۟()Z
    .locals 1

    .line 200
    iget-boolean v0, p0, Ll/ۛۘۗ;->ۢ:Z

    return v0
.end method

.method public final ۠()Z
    .locals 1

    .line 225
    iget-boolean v0, p0, Ll/ۛۘۗ;->ۙۙ:Z

    return v0
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 337
    iget-object v0, p0, Ll/ۛۘۗ;->֡:Ljava/lang/String;

    return-object v0
.end method

.method public final ۫()Ll/ܽۘۗ;
    .locals 1

    .line 345
    iget-object v0, p0, Ll/ۛۘۗ;->ᩳ:Ll/ܽۘۗ;

    return-object v0
.end method

.method public final ۫ۙ()V
    .locals 1

    const-string v0, "\n"

    .line 341
    iput-object v0, p0, Ll/ۛۘۗ;->֡:Ljava/lang/String;

    return-void
.end method

.method public final ۬()Z
    .locals 1

    .line 241
    iget-boolean v0, p0, Ll/ۛۘۗ;->ᩴۙ:Z

    return v0
.end method

.method public final ܰ()I
    .locals 1

    .line 361
    iget v0, p0, Ll/ۛۘۗ;->ܺۙ:I

    return v0
.end method

.method public final ܳ()Ll/᩵ۘۗ;
    .locals 1

    .line 305
    iget-object v0, p0, Ll/ۛۘۗ;->۟:Ll/᩵ۘۗ;

    return-object v0
.end method

.method public final ܳۙ()Z
    .locals 1

    .line 192
    iget-boolean v0, p0, Ll/ۛۘۗ;->ܶۙ:Z

    return v0
.end method

.method public final ܶ()Ljava/util/HashSet;
    .locals 1

    .line 405
    iget-object v0, p0, Ll/ۛۘۗ;->۠:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ܺۙ()V
    .locals 1

    const/4 v0, 0x1

    .line 166
    invoke-static {v0, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/ۛۘۗ;->᩻ۙ:I

    return-void
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 1

    .line 393
    iget-object v0, p0, Ll/ۛۘۗ;->ۖ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܽۙ()V
    .locals 2

    const/16 v0, 0x14

    const/4 v1, 0x1

    .line 365
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/ۛۘۗ;->ܺۙ:I

    return-void
.end method

.method public final ܿ()Ll/ۨۘۗ;
    .locals 1

    .line 369
    iget-object v0, p0, Ll/ۛۘۗ;->᩹ۙ:Ll/ۨۘۗ;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 249
    iget-boolean v0, p0, Ll/ۛۘۗ;->ۜ:Z

    return v0
.end method

.method public final ᩴۙ()Z
    .locals 1

    .line 184
    iget-boolean v0, p0, Ll/ۛۘۗ;->ۧۙ:Z

    return v0
.end method

.method public final ᩵()Ll/ܳܿۗ;
    .locals 1

    .line 413
    iget-object v0, p0, Ll/ۛۘۗ;->ܳۙ:Ll/ܳܿۗ;

    return-object v0
.end method

.method public final ᩶()Ll/ۘܿۗ;
    .locals 1

    .line 313
    iget-object v0, p0, Ll/ۛۘۗ;->ܽۙ:Ll/ۘܿۗ;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 329
    iget-object v0, p0, Ll/ۛۘۗ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷ۙ()Z
    .locals 1

    .line 265
    iget-boolean v0, p0, Ll/ۛۘۗ;->ۚۙ:Z

    return v0
.end method

.method public final ᩸ۙ()Z
    .locals 1

    .line 281
    iget-boolean v0, p0, Ll/ۛۘۗ;->֫ۙ:Z

    return v0
.end method

.method public final ᩹()Ljava/util/ArrayList;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ۛۘۗ;->᩷ۙ:Ljava/util/ArrayList;

    return-object v0
.end method
