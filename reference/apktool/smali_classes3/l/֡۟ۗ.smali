.class public final Ll/֡۟ۗ;
.super Ljava/lang/Object;
.source "A6F5"

# interfaces
.implements Ll/ۧ᩶ۗ;


# instance fields
.field public final ܰ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡۟ۗ;->ܰ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DECL_VAR: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֡۟ۗ;->ܰ:Ljava/util/ArrayList;

    const-string v2, ", "

    .line 72
    invoke-static {v1, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/֡۟ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 14
    sget-object v0, Ll/ۧ۟ۗ;->ᩴ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 1

    .line 19
    iget-object v0, p0, Ll/֡۟ۗ;->ܰ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۙ(Ll/ۧ֨ۗ;)V
    .locals 1

    .line 23
    iget-object v0, p0, Ll/֡۟ۗ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
