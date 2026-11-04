.class public final synthetic Ll/ۗ᩺᩻;
.super Ljava/lang/Object;
.source "H1KB"

# interfaces
.implements Ll/᩺ۘ᩷;
.implements Ll/ܿ֫ܺ;
.implements Ll/ۘ᩺᩻;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۗ᩺᩻;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ(Ljava/lang/String;Z)I
    .locals 0

    .line 2
    iget-object p2, p0, Ll/ۗ᩺᩻;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast p2, Ljava/util/HashSet;

    .line 575
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x2

    return p1
.end method

.method public ۙ(Ll/ۘۘ᩷;)Ljava/lang/CharSequence;
    .locals 3

    .line 2
    iget-object p1, p0, Ll/ۗ᩺᩻;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast p1, Ll/᩸ܳۧ;

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    invoke-virtual {p1}, Ll/ۧᩴۧ;->۫ۙ()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘۘ᩷;->֫()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0xc

    invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " dp"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۗ᩺᩻;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩶ܶۧ;

    check-cast p1, [Ljava/lang/Object;

    invoke-static {v0, p1}, Ll/᩶ܶۧ;->ۙ(Ll/᩶ܶۧ;[Ljava/lang/Object;)V

    return-void
.end method
