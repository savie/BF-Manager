.class public final Ll/ܽۤ᩵;
.super Ll/۬᩷᩵;
.source "Z6ER"


# instance fields
.field public final ۙ:Ll/֡᩷᩵;

.field public final ۤ:Ll/᩷ۡۗ;

.field public final ᩷:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/֡᩷᩵;Ljava/util/ArrayList;Ll/᩷ۡۗ;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ܽۤ᩵;->ۙ:Ll/֡᩷᩵;

    .line 30
    iput-object p2, p0, Ll/ܽۤ᩵;->᩷:Ljava/util/ArrayList;

    .line 31
    iput-object p3, p0, Ll/ܽۤ᩵;->ۤ:Ll/᩷ۡۗ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
    .locals 4

    .line 36
    new-instance v0, Ll/ܶۤ᩵;

    iget-object v1, p0, Ll/ܽۤ᩵;->᩷:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܽۤ᩵;->ۤ:Ll/᩷ۡۗ;

    iget-object v3, p0, Ll/ܽۤ᩵;->ۙ:Ll/֡᩷᩵;

    invoke-direct {v0, p1, v3, v1, v2}, Ll/ܶۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ljava/util/ArrayList;Ll/᩷ۡۗ;)V

    return-object v0
.end method
