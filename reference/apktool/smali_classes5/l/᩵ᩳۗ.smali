.class public final Ll/᩵ᩳۗ;
.super Ljava/lang/Object;
.source "9IVS"

# interfaces
.implements Ll/ۧ᩶ۗ;


# static fields
.field public static final ᩶:Ll/᩵ᩳۗ;


# instance fields
.field public final ܰ:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 16
    new-instance v0, Ll/᩵ᩳۗ;

    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    invoke-direct {v0, v1}, Ll/᩵ᩳۗ;-><init>(Ljava/util/Set;)V

    sput-object v0, Ll/᩵ᩳۗ;->᩶:Ll/᩵ᩳۗ;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/᩵ᩳۗ;->ܰ:Ljava/util/Set;

    return-void
.end method

.method public static ۙ(Ljava/util/Set;)Ll/᩵ᩳۗ;
    .locals 1

    .line 19
    invoke-static {p0}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    sget-object p0, Ll/᩵ᩳۗ;->᩶:Ll/᩵ᩳۗ;

    return-object p0

    .line 22
    :cond_0
    new-instance v0, Ll/᩵ᩳۗ;

    invoke-direct {v0, p0}, Ll/᩵ᩳۗ;-><init>(Ljava/util/Set;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 42
    sget-object v0, Ll/᩵ᩳۗ;->᩶:Ll/᩵ᩳۗ;

    if-ne p0, v0, :cond_0

    const-string v0, "TYPE_VARS: EMPTY"

    return-object v0

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_VARS: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵ᩳۗ;->ܰ:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/᩵ᩳۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 15
    sget-object v0, Ll/ۧ۟ۗ;->ۡ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/Set;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/᩵ᩳۗ;->ܰ:Ljava/util/Set;

    return-object v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
