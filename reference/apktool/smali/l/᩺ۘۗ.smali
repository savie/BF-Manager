.class public final Ll/᩺ۘۗ;
.super Ljava/lang/Object;
.source "TIYM"


# static fields
.field public static final ۙ:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 13
    const-class v0, Ll/᩺ۘۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/᩺ۘۗ;->ۙ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ll/֡ۘۗ;)V
    .locals 5

    .line 16
    invoke-virtual {p0}, Ll/֡ۘۗ;->ۙ()Ll/ۛۘۗ;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ll/ۛۘۗ;->᩹()Ljava/util/ArrayList;

    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ll/֡ۘۗ;->᩷()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    new-instance p0, Ll/֨ۧ᩵;

    const-string v0, "Please specify input file"

    .line 8
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p0

    .line 29
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    .line 30
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "--"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    .line 31
    :cond_2
    new-instance p0, Ll/֨ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown argument: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 31
    throw p0

    .line 34
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    .line 40
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    .line 41
    :cond_4
    new-instance p0, Ll/֨ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "File not found "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 41
    throw p0

    .line 19
    :cond_5
    sget-object p0, Ll/᩺ۘۗ;->ۙ:Ll/᩻ܽ᩺;

    invoke-interface {p0}, Ll/᩻ܽ᩺;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "Effective jadx args: {}"

    .line 20
    invoke-interface {p0, v0, v1}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    return-void
.end method
