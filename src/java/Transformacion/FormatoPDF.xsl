<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : FormatoPDF.xsl
    Created on : 6 de agosto de 2018, 0:14
    Author     : Carlos
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                xmlns:fo="http://www.w3.org/1999/XSL/Format" 
                version="1.0">
   

    <xsl:template match="root">
        <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">

            <fo:layout-master-set>
                <fo:simple-page-master master-name="first" 
                                       page-height="29.7cm" 
                                       page-width="21cm" 
                                       margin-top="1cm" 
                                       margin-bottom="2cm" 
                                       margin-left="2.5cm" 
                                       margin-right="2.5cm">
                    <fo:region-body margin-top="3cm"/>
                    <fo:region-before extent="3cm"/>
                    <fo:region-after extent="1.5cm"/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="first">

                <fo:flow flow-name="xsl-region-body">


                    <fo:block font-size="18pt" 
                              font-family="sans-serif" 
                              line-height="24pt"
                              space-after.optimum="15pt"
                              background-color="black"
                              color="white"
                              text-align="center"
                              padding-top="3pt"
                    >
                        Ramos
                    </fo:block>	
                    
                    
                    <xsl:apply-templates/>

                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
    
    <xsl:template match="Historial">
        <fo:table  border-collapse="separate" border-width="0.5mm" 
                   border-style="solid">
            <fo:table-column column-width="3.2cm"/>
            <fo:table-column column-width="3.2cm"/>
            <fo:table-column column-width="3.2cm"/>
            <fo:table-column column-width="3.2cm"/>
            
            <fo:table-body>

                <fo:table-row>
                    <fo:table-cell >
                        <fo:block>Id</fo:block>
                    </fo:table-cell>
                    <fo:table-cell >
                        <fo:block>Ramo</fo:block>
                    </fo:table-cell>
                    <fo:table-cell >
                        <fo:block>Promedio</fo:block>
                    </fo:table-cell>
                    <fo:table-cell >
                        <fo:block>Estado</fo:block>
                    </fo:table-cell>
                    
                </fo:table-row>

                <xsl:apply-templates/>

            </fo:table-body>
        </fo:table>
    </xsl:template>
    
    <xsl:template match="HISTORIAL">
        <fo:table-row>

            <xsl:apply-templates/>

        </fo:table-row>  
    </xsl:template> 
    
    <xsl:template match="ID">
        <fo:table-cell >
            <fo:block>
                <xsl:value-of select="."/>
            </fo:block>
        </fo:table-cell>
    </xsl:template> 
    <xsl:template match="RAMO">
        <fo:table-cell >
            <fo:block>
                <xsl:value-of select="."/>
            </fo:block>
        </fo:table-cell>
    </xsl:template> 
    <xsl:template match="PROMEDIO">
        <fo:table-cell >
            <fo:block>
                <xsl:value-of select="."/>
            </fo:block>
        </fo:table-cell>
    </xsl:template> 
    <xsl:template match="ESTADO">
        <fo:table-cell >
            <fo:block>
                <xsl:value-of select="."/>
            </fo:block>
        </fo:table-cell>
    </xsl:template> 
    
    
    

</xsl:stylesheet>
