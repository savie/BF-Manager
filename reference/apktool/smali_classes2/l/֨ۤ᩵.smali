.class public abstract Ll/֨ۤ᩵;
.super Ljava/lang/Object;
.source "Q6IJ"


# instance fields
.field public final ۙ:Ll/۟ۤ᩵;


# direct methods
.method public constructor <init>(Ll/۟ۤ᩵;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/֨ۤ᩵;->ۙ:Ll/۟ۤ᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    const-string v1, " "

    .line 56
    invoke-static {v0, v1}, Ll/ۘۧ᩵;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    .line 57
    invoke-static {v2, v1}, Ll/ۘۧ᩵;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    invoke-virtual {p0}, Ll/֨ۤ᩵;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "TERMINAL "

    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v3, " {"

    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "centrality: "

    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    invoke-virtual {p0}, Ll/֨ۤ᩵;->ۚ()Ll/֡᩷᩵;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "none"

    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    :goto_0
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-virtual {p0}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    invoke-virtual {p0}, Ll/֨ۤ᩵;->۫()Ll/ᩳۤ᩵;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 85
    invoke-virtual {v1}, Ll/ᩳۤ᩵;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v1, "NO ACTIVE BLOCK"

    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    :goto_1
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    .line 92
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫()Z
.end method

.method public final ۙ(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
    .locals 0

    .line 48
    invoke-virtual {p0, p1}, Ll/֨ۤ᩵;->᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()Ll/ᩳۤ᩵;
    .locals 1

    .line 105
    invoke-virtual {p0}, Ll/֨ۤ᩵;->۫()Ll/ᩳۤ᩵;

    move-result-object v0

    return-object v0
.end method

.method public abstract ۚ()Ll/֡᩷᩵;
.end method

.method public final ۤ()Ll/۟ۤ᩵;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/֨ۤ᩵;->ۙ:Ll/۟ۤ᩵;

    return-object v0
.end method

.method public abstract ۫()Ll/ᩳۤ᩵;
.end method

.method public abstract ܳ()Ll/ۧ᩸ۨ;
.end method

.method public final ᩴ()Ll/ۡ᩷᩵;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/֨ۤ᩵;->ۙ:Ll/۟ۤ᩵;

    .line 109
    invoke-virtual {v0, p0}, Ll/۟ۤ᩵;->ۙ(Ll/֨ۤ᩵;)Ll/ۡ᩷᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/֡᩷᩵;
    .locals 3

    .line 97
    invoke-virtual {p0}, Ll/֨ۤ᩵;->ۚ()Ll/֡᩷᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 99
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Centrality state is not supported for "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
.end method

.method public abstract ᩸()Ll/ۢۤ᩵;
.end method
