.class public final synthetic Ll/ܶۨᩴ;
.super Ljava/lang/Object;
.source "D18B"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/᩵ܿᩴ;
.implements Ll/ۤ֨ܳ;
.implements Ll/᩹ۘۙ;
.implements Ll/ۘ᩺᩻;
.implements Ll/ۢ᩵ۨ;


# direct methods
.method public static bridge synthetic ۙ(Landroid/system/StructStat;)Landroid/system/StructTimespec;
    .locals 0

    .line 0
    iget-object p0, p0, Landroid/system/StructStat;->st_ctim:Landroid/system/StructTimespec;

    return-object p0
.end method

.method public static bridge synthetic ۙ()Ljava/lang/Class;
    .locals 1

    .line 0
    const-class v0, Landroid/content/pm/ShortcutManager;

    return-object v0
.end method

.method public static ۙ(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ᩷()Ljava/lang/Class;
    .locals 1

    .line 0
    const-class v0, Ljava/lang/invoke/MethodHandle;

    return-object v0
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 200
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 0
    check-cast p1, Ljava/io/File;

    invoke-static {p1}, Ll/֡ۗۨ;->ۙ(Ljava/io/File;)V

    return-void
.end method

.method public get()Ll/ۨܿᩴ;
    .locals 1

    .line 0
    sget v0, Ll/ܰۨᩴ;->ۙ:I

    const/4 v0, 0x0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(Ljava/lang/String;Z)I
    .locals 0

    .line 0
    sget-object p1, Ll/ܰ᩺᩻;->ۧۙ:Ll/᩻֫ܺ;

    const/4 p1, 0x1

    return p1
.end method

.method public ۙ(Ll/᩻᩺ۙ;)Ljava/lang/String;
    .locals 1

    .line 83
    iget-object p1, p1, Ll/᩻᩺ۙ;->ᩴ:Ljava/lang/String;

    if-eqz p1, :cond_0

    return-object p1

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Media cache key is missing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
