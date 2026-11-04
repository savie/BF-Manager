.class public Ll/ܳܰۗ;
.super Ljava/lang/Object;
.source "CITH"

# interfaces
.implements Ll/ۗۘۗ;


# static fields
.field public static final ܳ:Ll/᩻ܽ᩺;


# instance fields
.field public ۙ:Ljava/lang/StringBuilder;

.field public ۤ:Ljava/lang/String;

.field public final ᩴ:Ljava/lang/String;

.field public ᩷:I

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 20
    const-class v0, Ll/ܳܰۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ܳܰۗ;->ܳ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    const-string v0, ""

    .line 23
    iput-object v0, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 24
    iput v0, p0, Ll/ܳܰۗ;->᩷:I

    const-string v0, "    "

    .line 46
    iput-object v0, p0, Ll/ܳܰۗ;->ᩴ:Ljava/lang/String;

    .line 47
    sget-object v0, Ll/ۛۘۗ;->ۗۙ:Ljava/lang/String;

    iput-object v0, p0, Ll/ܳܰۗ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۛۘۗ;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    const-string v0, ""

    .line 23
    iput-object v0, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 24
    iput v0, p0, Ll/ܳܰۗ;->᩷:I

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-virtual {p1}, Ll/ۛۘۗ;->᩷()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܰۗ;->ᩴ:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Ll/ۛۘۗ;->ۤ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܳܰۗ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/String;)Ll/ۗۘۗ;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Ll/ܳܰۗ;->add(Ljava/lang/String;)Ll/ܳܰۗ;

    move-result-object p1

    return-object p1
.end method

.method public add(Ljava/lang/String;)Ll/ܳܰۗ;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final getLength()I
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 248
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()V
    .locals 2

    .line 143
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۙ()I
    .locals 1

    .line 177
    iget v0, p0, Ll/ܳܰۗ;->᩷:I

    return v0
.end method

.method public bridge synthetic ۙ(C)Ll/ۗۘۗ;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Ll/ܳܰۗ;->ۙ(C)Ll/ܳܰۗ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۙ(Ljava/lang/String;)Ll/ۗۘۗ;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Ll/ܳܰۗ;->ۙ(Ljava/lang/String;)Ll/ܳܰۗ;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(Ll/ۤܰۗ;)Ll/ۗۘۗ;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    .line 248
    iget-object p1, p1, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 122
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public ۙ(C)Ll/ܳܰۗ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public ۙ(Ljava/lang/String;)Ll/ܳܰۗ;
    .locals 4

    .line 100
    iget-object v0, p0, Ll/ܳܰۗ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 101
    iget-object v1, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0

    .line 103
    :cond_0
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final ۙ(I)V
    .locals 1

    .line 182
    iput p1, p0, Ll/ܳܰۗ;->᩷:I

    .line 148
    iget-object v0, p0, Ll/ܳܰۗ;->ᩴ:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ۘۧ᩵;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public ۙ(Ll/ۧܰۗ;)V
    .locals 0

    return-void
.end method

.method public ۙ(Ll/ܺܰۗ;)V
    .locals 0

    return-void
.end method

.method public ۙ(Ll/ܽܰۗ;)V
    .locals 0

    return-void
.end method

.method public ۚ()V
    .locals 2

    .line 139
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܰۗ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۤ(I)Ll/ܳܰۗ;
    .locals 0

    if-nez p1, :cond_0

    .line 57
    invoke-virtual {p0}, Ll/ܳܰۗ;->ۚ()V

    .line 58
    invoke-virtual {p0}, Ll/ܳܰۗ;->֫()V

    return-object p0

    .line 57
    :cond_0
    invoke-virtual {p0}, Ll/ܳܰۗ;->ۚ()V

    .line 58
    invoke-virtual {p0}, Ll/ܳܰۗ;->֫()V

    .line 93
    invoke-virtual {p0, p1}, Ll/ܳܰۗ;->᩷(I)V

    return-object p0
.end method

.method public final ۤ()V
    .locals 2

    .line 162
    iget v0, p0, Ll/ܳܰۗ;->᩷:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܳܰۗ;->᩷:I

    .line 148
    iget-object v1, p0, Ll/ܳܰۗ;->ᩴ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۘۧ᩵;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 248
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()V
    .locals 2

    .line 167
    iget v0, p0, Ll/ܳܰۗ;->᩷:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܳܰۗ;->᩷:I

    if-gez v0, :cond_0

    .line 169
    sget-object v0, Ll/ܳܰۗ;->ܳ:Ll/᩻ܽ᩺;

    const-string v1, "Indent < 0"

    invoke-interface {v0, v1}, Ll/᩻ܽ᩺;->᩸(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 170
    iput v0, p0, Ll/ܳܰۗ;->᩷:I

    .line 148
    :cond_0
    iget-object v0, p0, Ll/ܳܰۗ;->ᩴ:Ljava/lang/String;

    iget v1, p0, Ll/ܳܰۗ;->᩷:I

    invoke-static {v1, v0}, Ll/ۘۧ᩵;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public final ܳ()Ll/ܳܰۗ;
    .locals 1

    .line 57
    invoke-virtual {p0}, Ll/ܳܰۗ;->ۚ()V

    .line 58
    invoke-virtual {p0}, Ll/ܳܰۗ;->֫()V

    const/16 v0, 0x7d

    .line 65
    invoke-virtual {p0, v0}, Ll/ܳܰۗ;->ۙ(C)Ll/ܳܰۗ;

    return-object p0
.end method

.method public ᩴ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۤܰۗ;

    return v0
.end method

.method public final ᩷()Ll/ܳܰۗ;
    .locals 0

    .line 57
    invoke-virtual {p0}, Ll/ܳܰۗ;->ۚ()V

    .line 58
    invoke-virtual {p0}, Ll/ܳܰۗ;->֫()V

    return-object p0
.end method

.method public final ᩷(Ljava/lang/String;)Ll/ܳܰۗ;
    .locals 0

    .line 57
    invoke-virtual {p0}, Ll/ܳܰۗ;->ۚ()V

    .line 58
    invoke-virtual {p0}, Ll/ܳܰۗ;->֫()V

    .line 72
    invoke-virtual {p0, p1}, Ll/ܳܰۗ;->add(Ljava/lang/String;)Ll/ܳܰۗ;

    return-object p0
.end method

.method public ᩷(I)V
    .locals 0

    return-void
.end method

.method public final ᩸()Ll/ܳܰۗ;
    .locals 0

    .line 128
    invoke-virtual {p0}, Ll/ܳܰۗ;->ۚ()V

    return-object p0
.end method
